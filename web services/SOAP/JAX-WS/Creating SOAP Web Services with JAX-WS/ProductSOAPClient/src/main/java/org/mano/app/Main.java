/*
*   Livre Programação ltda-ME
*
*   Criando um Web Services SOAP com JAX-WS.
*
*/
package org.mano.app;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.mano.produto.boundary.Product;
import org.mano.produto.boundary.ProductWS;
import org.mano.produto.boundary.ProductWSService;

public class Main extends JFrame {

    private static final long serialVersionUID = -1902589667628366425L;
    private static List<Product> products = new ArrayList<>();
    private JTable table;

    public Main() {
        super("List of Products");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout(5, 5));
        
        ProductWSService webService = new ProductWSService();
        ProductWS productWS = webService.getProductWSPort();
        products = productWS.getAllProductDetails();
        
        table = new JTable();
        populateTable();
        add(new JScrollPane(table), BorderLayout.CENTER);
        setVisible(true);
    }

    private void populateTable() {
        String columnNames[] = {"ID", "Name", "Composition", "Attribute",
            "Company", "Quantity", "Type", "Price"};
        DefaultTableModel dataModel = new DefaultTableModel(columnNames,
                products.size());
        int row = 0;
        for (Product p : products) {
            dataModel.setValueAt(p.getId(), row, 0);
            dataModel.setValueAt(p.getName(), row, 1);
            dataModel.setValueAt(p.getComposition(), row, 2);
            dataModel.setValueAt(p.getAttribute(), row, 3);
            dataModel.setValueAt(p.getCompany(), row, 4);
            dataModel.setValueAt(p.getQuantity(), row, 5);
            dataModel.setValueAt(p.getType(), row, 6);
            dataModel.setValueAt(p.getPrice(), row, 7);
            row++;
        }
        table.setModel(dataModel);
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
