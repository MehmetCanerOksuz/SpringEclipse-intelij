package com.caneroksuz;

import com.caneroksuz.dao.AgentDAO;
import com.caneroksuz.dao.BuyerDAO;
import com.caneroksuz.dao.PropertyDAO;
import com.caneroksuz.dao.SellerDAO;
import com.caneroksuz.model.Agent;
import com.caneroksuz.model.Buyer;
import com.caneroksuz.model.Property;
import com.caneroksuz.model.Seller;

import java.math.BigDecimal;

public class AppMain2 {

    public static void main(String[] args) {

        AgentDAO agentDAO = new AgentDAO();
        BuyerDAO buyerDAO = new BuyerDAO();
        PropertyDAO propertyDAO = new PropertyDAO();
        SellerDAO sellerDAO = new SellerDAO();


        Agent agent = new Agent();
        agent.setAgentName("Lolo Emlak");
        agent.setPhone("123456789");
        agent.setEmail("lolo2123132@gmail.com");
        agent.setOfficeAddress("Kadıköy");
        agentDAO.saveOrdUpdateAgent(agent);

        Agent agent2 = new Agent();
        agent2.setAgentName("Abc Emlak");
        agent2.setPhone("343243242");
        agent2.setEmail("abc34554@gmail.com");
        agent2.setOfficeAddress("Beşiktaş");
        agentDAO.saveOrdUpdateAgent(agent2);


        Buyer buyer = new Buyer();
        buyer.setFirstName("Salih Polat");
        buyer.setLastName("Dönmez");
        buyer.setPhone("89444565153");
        buyer.setEmail("spd654646@gmail.com");
        buyerDAO.saveOrdUpdateBuyer(buyer);

        Buyer buyer2 = new Buyer();
        buyer2.setFirstName("Yiğitcan");
        buyer2.setLastName("Abay");
        buyer2.setPhone("78787878");
        buyer2.setEmail("yabay62621@gmail.com");
        buyerDAO.saveOrdUpdateBuyer(buyer2);


        Seller seller = new Seller();
        seller.setFirstName("Orhun");
        seller.setLastName("Bayındır ");
        seller.setPhone("5555555");
        seller.setEmail("orh777222@gmail.com");
        sellerDAO.saveOrdUpdateSeller(seller);

        Seller seller2 = new Seller();
        seller2.setFirstName("Osman Onur");
        seller2.setLastName("Baş ");
        seller2.setPhone("44444");
        seller2.setEmail("onur555533@gmail.com");
        sellerDAO.saveOrdUpdateSeller(seller2);


        Property property = new Property();
        property.setTitle("Dublex");
        property.setArea(300.55F);
        property.setBedrooms(6);
        property.setBathrooms(2);
        property.setPrice(BigDecimal.valueOf(1_000_000.25));
        property.setDescription("Doktordan temiz kullanılmış.");
        property.setSeller(seller);
        property.getBuyers().add(buyer);
        propertyDAO.saveOrdUpdateProperty(property);

        Property property2 = new Property();
        property2.setTitle("House");
        property2.setArea(200.11F);
        property2.setBedrooms(4);
        property2.setBathrooms(1);
        property2.setPrice(BigDecimal.valueOf(80_000.90));
        property2.setDescription("Memurdan temiz kullanılmış.");
        property2.setSeller(seller2);
        property2.getBuyers().add(buyer2);
        propertyDAO.saveOrdUpdateProperty(property2);


        System.out.println("Agents");
        agentDAO.getAllAgents().forEach(System.out::println);

        System.out.println("Buyers");
        buyerDAO.getAllBuyers().forEach(System.out::println);

        System.out.println("Sellers");
        sellerDAO.getAllSellers().forEach(System.out::println);

        System.out.println("Property");
        propertyDAO.getAllProperties().forEach(System.out::println);

    }
}
