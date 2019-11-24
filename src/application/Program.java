package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {


    public static void main(String[] args) {

       /* Department obj = new Department (1, " Books");
        System.out.println(obj);


        Seller seller = new Seller(23, "Juca", "juca@juca.com" , new Date(), 6000.0, obj);
        System.out.println(seller);*/

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);


    }


}
