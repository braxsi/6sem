package braxxi.kursach.commons.entity;

import java.util.ArrayList;

public class Script1 {

    public static ScriptEntity create () {

        ArrayList pageList1 = new ArrayList();
        /// page 0
        ArrayList actionList1 = new ArrayList();
        ActionEntity ae1 = new ActionEntity(new Long(0));
        ae1.setTransit(1); // переход на  страницу 1
        ae1.setBandage(0);
        ae1.setGold(0);
        ae1.setRadiation(0);
        ae1.setCartridges(0);
        actionList1.add(ae1);

        ActionEntity ae2 = new ActionEntity(new Long(1));
        ae2.setTransit(2); // переход на  страницу 2
        ae2.setBandage(0);
        ae2.setGold(0);
        ae2.setRadiation(0);
        ae2.setCartridges(0);
        //ae2.setTransit(-1);
        actionList1.add(ae2);

        PageEntity p1 = new PageEntity(new Long(0));
        p1.setTitle("Выбор 1");
        p1.setText("Идти ... <ol><li>по дороге</li><li>через восточную часть кардона</li></ol>");
        p1.setActionList(actionList1);
        pageList1.add(p1);

        /// page 1
        ArrayList actionList2 = new ArrayList();
        ActionEntity ae1_1 = new ActionEntity(new Long(0));
        ae1_1.setTransit(3); // переход на  страницу 3
        ae1_1.setBandage(-1);
        ae1_1.setGold(0);
        ae1_1.setRadiation(0);
        ae1_1.setCartridges(0);
        actionList2.add(ae1_1);

        ActionEntity ae2_1 = new ActionEntity(new Long(1));
        ae2_1.setTransit(-1); // смерть
        ae2_1.setBandage(0);
        ae2_1.setGold(0);
        ae2_1.setRadiation(0);
        ae2_1.setCartridges(0);
        //ae2.setTransit(-1);
        actionList2.add(ae2_1);

        PageEntity p2 = new PageEntity(new Long(1));
        p2.setTitle("Выбор 2_1");
        p2.setText("Вы встретили раненого сталкера. Что вы сделаете ... <ol><li>дать аптечку</li><li>пройти мимо</li></ol>");
        p2.setActionList(actionList2);
        pageList1.add(p2);

        /// page 3
        ArrayList actionList3 = new ArrayList();
        ActionEntity ae1_3 = new ActionEntity(new Long(0));
        ae1_3.setTransit(4); // переход на  страницу 4
        ae1_3.setBandage(0);
        ae1_3.setGold(0);
        ae1_3.setRadiation(0);
        ae1_3.setCartridges(0);
        actionList3.add(ae1_3);

        PageEntity p3 = new PageEntity(new Long(3));
        p3.setTitle("Страница 3");
        p3.setText("Лагерь Лиса ... <ol><li>идите далее</li></ol>");
        p3.setActionList(actionList3);
        pageList1.add(p3);

        /// page 2
        ArrayList actionList2_2 = new ArrayList();
        ActionEntity ae2_2 = new ActionEntity(new Long(0));
        ae2_2.setTransit(-1); // смерть
        ae2_2.setBandage(0);
        ae2_2.setGold(0);
        ae2_2.setRadiation(0);
        ae2_2.setCartridges(0);
        actionList2_2.add(ae2_2);

        ActionEntity ae2_3 = new ActionEntity(new Long(1));
        ae2_3.setTransit(3); // переход на  страницу 3
        ae2_3.setBandage(0);
        ae2_3.setGold(0);
        ae2_3.setRadiation(0);
        ae2_3.setCartridges(-10);
        //ae2.setTransit(-1);
        actionList2_2.add(ae2_3);

        PageEntity p4 = new PageEntity(new Long(2));
        p4.setTitle("Выбор 2_2");
        p4.setText("Вы шли мимо полуразрушенных зданий, постоянно озираясь по сторонам, и вовремя заметили медленно надвигающихся на вас 3 зомби. Выглядят они не очень устрашающе, но кто знает на что они способны. Вы... ... <ol><li>убежите</li><li>постреляете зомби (для этого требуется 10 патронов)</li></ol>");
        p4.setActionList(actionList2_2);
        pageList1.add(p4);

        /// page 4
        ArrayList actionList4 = new ArrayList();
        ActionEntity ae4_1 = new ActionEntity(new Long(0));
        ae4_1.setTransit(6); // переход на  страницу 6
        ae4_1.setBandage(-1);
        ae4_1.setGold(0);
        ae4_1.setRadiation(0);
        ae4_1.setCartridges(0);
        actionList4.add(ae4_1);

        ActionEntity ae4_2 = new ActionEntity(new Long(1));
        ae4_2.setTransit(7); // переход на страницу 7
        ae4_2.setBandage(0);
        ae4_2.setGold(0);
        ae4_2.setRadiation(0);
        ae4_2.setCartridges(0);
        //ae2.setTransit(-1);
        actionList4.add(ae4_2);

        PageEntity p5 = new PageEntity(new Long(5));
        p5.setTitle("Выбор 3");
        p5.setText("На вас набросились бандиты. Одеты они в прочную броню, с собой пушки. Они требуют, чтобы вы отдали им артефакт. Что вы сделаете? ... <ol><li>бежать к Лису</li><li>отдать артефакт</li></ol>");
        p5.setActionList(actionList4);
        pageList1.add(p5);

        /// page 5
        ArrayList actionList5 = new ArrayList();
        ActionEntity ae5_1 = new ActionEntity(new Long(0));
        ae5_1.setTransit(6); // переход на  страницу 6
        ae5_1.setBandage(-1);
        ae5_1.setGold(0);
        ae5_1.setRadiation(0);
        ae5_1.setCartridges(0);
        actionList5.add(ae5_1);

        ActionEntity ae5_2 = new ActionEntity(new Long(0));
        ae5_2.setTransit(-1); // смерть
        ae5_2.setBandage(0);
        ae5_2.setGold(0);
        ae5_2.setRadiation(0);
        ae5_2.setCartridges(0);
        actionList5.add(ae5_2);

        PageEntity p6 = new PageEntity(new Long(6));
        p6.setTitle("Выбор 4_1");
        p6.setText("Вы отстреливались от бандитов отважно, не думая о том, что будет после. Вы справились и защитили цель своего задания, однако вас ранили. Раны несильные и вы можете идти без помощи. Полечите ли вы себя? ... <ol><li>использовать аптечку</li><li>не использовать аптечку</li></ol>");
        p6.setActionList(actionList5);
        pageList1.add(p6);

        /// page 6
        ArrayList actionList6 = new ArrayList();
        ActionEntity ae6_1 = new ActionEntity(new Long(0));
        ae6_1.setTransit(11); // переход на  страницу 11
        ae6_1.setBandage(0);
        ae6_1.setGold(0);
        ae6_1.setRadiation(0);
        ae6_1.setCartridges(0);
        actionList6.add(ae6_1);

        ActionEntity ae6_2 = new ActionEntity(new Long(1));
        ae6_2.setTransit(12); // переход на  страницу 12
        ae6_2.setBandage(0);
        ae6_2.setGold(0);
        ae6_2.setRadiation(0);
        ae6_2.setCartridges(0);
        actionList6.add(ae6_2);

        PageEntity p7 = new PageEntity(new Long(7));
        p7.setTitle("Выбор 4_2");
        p7.setText("Вам показалось, что битва будет слишком неравной и вам пришлось отдать артефакт. Вы думаете над тем, что же дальше делать. ... <ol><li>идти к Лису</li><li>идти к Сидоровичу</li></ol>");
        p7.setActionList(actionList6);
        pageList1.add(p7);

        /// page 7
        ArrayList actionList7 = new ArrayList();
        ActionEntity ae7_1 = new ActionEntity(new Long(0));
        ae7_1.setTransit(8); // переход на  страницу 8
        ae7_1.setBandage(0);
        ae7_1.setGold(0);
        ae7_1.setRadiation(0);
        ae7_1.setCartridges(-15);
        actionList7.add(ae7_1);

        ActionEntity ae7_2 = new ActionEntity(new Long(0));
        ae7_2.setTransit(-1); // смерть
        ae7_2.setBandage(0);
        ae7_2.setGold(0);
        ae7_2.setRadiation(0);
        ae7_2.setCartridges(0);
        actionList7.add(ae7_2);

        PageEntity p8 = new PageEntity(new Long(8));
        p8.setTitle("Выбор 5_1");
        p8.setText("Наконец вы добрались до Лиса. Он спросил чего вы выглядите таким потрёпанным и вы рассказали о своих приключениях. Он все это время сидел и внимательно слушал вас. В конце концов он предложил вам пойти и разобраться с бандитами. Но лишних патронов у нас нет, поэтому придется вам использовать свои. Но это только если вы согласитесь. Пора ли наконец с ними разобраться? ... <ol><li>конечно, давно пора с ними разобраться (минус 15 патронов)</li><li>я и так их немного потрепал, с них хватит</li></ol>");
        p8.setActionList(actionList6);
        pageList1.add(p8);

        /// page 8
        ArrayList actionList8 = new ArrayList();
        ActionEntity ae8_1 = new ActionEntity(new Long(0));
        ae8_1.setTransit(9); // переход на  страницу 9
        ae8_1.setBandage(0);
        ae8_1.setGold(0);
        ae8_1.setRadiation(0);
        ae8_1.setCartridges(0);
        actionList8.add(ae8_1);

        ActionEntity ae8_2 = new ActionEntity(new Long(1));
        ae8_2.setTransit(10); // переход на страницу 10
        ae8_2.setBandage(0);
        ae8_2.setGold(0);
        ae8_2.setRadiation(0);
        ae8_2.setCartridges(0);
        //ae2.setTransit(-1);
        actionList8.add(ae8_2);

        PageEntity p9 = new PageEntity(new Long(9));
        p9.setTitle("Выбор 3");
        p9.setText("На вас набросились бандиты. Одеты они в прочную броню, с собой пушки. Они требуют, чтобы вы отдали им артефакт. Что вы сделаете? ... <ol><li>бежать к Лису</li><li>отдать артефакт</li></ol>");
        p9.setActionList(actionList4);
        pageList1.add(p9);



        ScriptEntity se = new ScriptEntity(new Long(1));
        se.setName("1");
        se.setPageList(pageList1);
        se.setEndPage(new Long(3));
        return se;
    }
}
