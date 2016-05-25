#!/bin/bash

apt-get update

apt-get install -y curl

# NodeSource Node.js Binary Distributions
curl -sL https://deb.nodesource.com/setup_6.x | bash -
apt-get install -y nodejs

# https://github.com/nodejs/node-v0.x-archive/issues/3911
#apt-get install -y npm
npm install -g bower
ln -sf /usr/bin/nodejs /usr/bin/node

npm install npm@latest -g

npm install -g tsd@^0.6.0
tsd install angular2 es6-promise rx rx-lite

# sass
# If you're using a distribution of Linux, you'll need to install Ruby first. 
# You can install Ruby through the apt package manager, rbenv, or rvm. 
su -c "gem install sass"

# less
# The easiest way to install Less on the server, is via npm, the node.js package manager.
npm install -g less

# Grunt and Grunt plugins
npm install -g grunt-cli

# Express application generator
npm install express-generator -g

# Install gulp globally
npm install --global gulp-cli

# Installing Karma and plugins
# Create and run unit tests, with Karma
npm install karma --save-dev
npm install karma-jasmine karma-chrome-launcher --save-dev



