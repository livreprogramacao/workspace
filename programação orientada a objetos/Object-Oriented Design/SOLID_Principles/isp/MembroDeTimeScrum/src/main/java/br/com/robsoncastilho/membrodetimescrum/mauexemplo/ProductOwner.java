package br.com.robsoncastilho.membrodetimescrum.mauexemplo;


public class ProductOwner implements MembroDeTimeScrum {

    @Override
    public void PriorizarBacklog() {
        System.out.println("Priorizando backlog com base nas minhas necessidades de negócio");
    }

    @Override
    public void BlindarTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ImplementarFuncionalidades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
