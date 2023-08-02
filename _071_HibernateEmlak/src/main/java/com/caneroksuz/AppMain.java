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

public class AppMain {

    public static void main(String[] args) {

        AgentDAO agentDAO = new AgentDAO();
        BuyerDAO buyerDAO = new BuyerDAO();
        PropertyDAO propertyDAO = new PropertyDAO();
        SellerDAO sellerDAO = new SellerDAO();

        Agent agent1 = Agent.builder().agentName("Lolo Emlak").phone("123456789")
                .email("lolo123123@gmail.com")
                .officeAddress("Kadıköy").build();

        agentDAO.saveOrdUpdateAgent(agent1);

        Agent agent2 = Agent.builder().agentName("ABC Emlak").phone("1231212512")
                .email("abc123123@gmail.com")
                .officeAddress("Beşiktaş").build();

        agentDAO.saveOrdUpdateAgent(agent2);

        Buyer buyer1 = Buyer.builder().firstName("Salih Polat").lastName("Dönmez")
                .phone("89444565153")
                .email("spd6546546@gmail.com").build();
        buyerDAO.saveOrdUpdateBuyer(buyer1);

        Buyer buyer2 = Buyer.builder().firstName("Yiğitcan").lastName("Abay")
                .phone("51645245232")
                .email("yabay6546546@gmail.com").build();
        buyerDAO.saveOrdUpdateBuyer(buyer2);

        Seller seller1 = Seller.builder().firstName("Orhun").lastName("Bayındır")
                .phone("346347548456")
                .email("orh77534@gmail.com").build();
        sellerDAO.saveOrdUpdateSeller(seller1);

        Seller seller2 = Seller.builder().firstName("Osman Onur").lastName("Baş")
                .phone("4454544")
                .email("onur4124124@gmail.com").build();
        sellerDAO.saveOrdUpdateSeller(seller2);

        Property property1 = Property.builder().title("Dublex").area(300.55F)
                .bedrooms(6)
                .bathrooms(2)
                .price(BigDecimal.valueOf(1000000000.25))
                .description("Doktordan temiz kullanılmıs.").build();
        property1.setSeller(seller1);
        property1.getBuyers().add(buyer1);

        propertyDAO.saveOrdUpdateProperty(property1);

        Property property2 = Property.builder().title("House").area(200.11f)
                .bedrooms(4)
                .bathrooms(1)
                .price(BigDecimal.valueOf(80000000.25))
                .description("Memurdan temiz kullanılmıs.").build();
        property2.setSeller(seller2);
        property2.getBuyers().add(buyer1);

        propertyDAO.saveOrdUpdateProperty(property2);

        System.out.println("Agents");
        agentDAO.getAllAgents().forEach(System.out::println);

        System.out.println("Buyers");
        buyerDAO.getAllBuyers().forEach(System.out::println);

        System.out.println("Sellers");
        sellerDAO.getAllSellers().forEach(System.out::println);

        System.out.println("Properties");
        propertyDAO.getAllProperties().forEach(System.out::println);


    }
}
