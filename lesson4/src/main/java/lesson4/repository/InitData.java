package lesson4.repository;

import lesson4.domain.ProductinShop;

import javax.persistence.EntityManager;

public class InitData {

    private static ProductinShop PRODUCT_1 = new ProductinShop();
    private static ProductinShop PRODUCT_2 = new ProductinShop();
    private static ProductinShop PRODUCT_3 = new ProductinShop();
    private static ProductinShop PRODUCT_4 = new ProductinShop();
    private static ProductinShop PRODUCT_5 = new ProductinShop();
    private static ProductinShop PRODUCT_6 = new ProductinShop();
    private static ProductinShop PRODUCT_7 = new ProductinShop();
    private static ProductinShop PRODUCT_8 = new ProductinShop();
    private static ProductinShop PRODUCT_9 = new ProductinShop();
    private static ProductinShop PRODUCT_10 = new ProductinShop();
    static {
        PRODUCT_1.setTitle("mango");
        PRODUCT_1.setPrice(306.0);
        PRODUCT_2.setTitle("eggs");
        PRODUCT_2.setPrice(65.50);
        PRODUCT_3.setTitle("tomato");
        PRODUCT_3.setPrice(90.30);
        PRODUCT_4.setTitle("apple");
        PRODUCT_4.setPrice(85.32);
        PRODUCT_5.setTitle("banana");
        PRODUCT_5.setPrice(65.65);
        PRODUCT_6.setTitle("orange");
        PRODUCT_6.setPrice(106.0);
        PRODUCT_7.setTitle("corn");
        PRODUCT_7.setPrice(55.50);
        PRODUCT_8.setTitle("watermelon");
        PRODUCT_8.setPrice(97.30);
        PRODUCT_9.setTitle("strawberry");
        PRODUCT_9.setPrice(835.32);
        PRODUCT_10.setTitle("shrimp");
        PRODUCT_10.setPrice(530.65);

    }

    public static void initData (EntityManager em){
        initProduct(em);
    }
    private static void initProduct(EntityManager em) {
        em.getTransaction().begin();
        System.out.println("Product initialized");
        PRODUCT_1 = em.merge(PRODUCT_1);
        PRODUCT_2 = em.merge(PRODUCT_2);
        PRODUCT_3 = em.merge(PRODUCT_3);
        PRODUCT_4 = em.merge(PRODUCT_4);
        PRODUCT_5 = em.merge(PRODUCT_5);
        PRODUCT_6 = em.merge(PRODUCT_6);
        PRODUCT_7 = em.merge(PRODUCT_7);
        PRODUCT_8 = em.merge(PRODUCT_8);
        PRODUCT_9 = em.merge(PRODUCT_9);
        PRODUCT_10 = em.merge(PRODUCT_10);
        em.getTransaction().commit();
    }

    public static ProductinShop getProduct1() {
        return PRODUCT_1;
    }

    public static ProductinShop getProduct2() {
        return PRODUCT_2;
    }

    public static ProductinShop getProduct3() {
        return PRODUCT_3;
    }

    public static ProductinShop getProduct4() {
        return PRODUCT_4;
    }

    public static ProductinShop getProduct5() {
        return PRODUCT_5;
    }
}
