package braxxi.kursach.commons.entity;

import java.util.ArrayList;

public class Script2 {

    public static ScriptEntity create () {

        ArrayList pageList1 = new ArrayList();
        /// page 1
        ArrayList actionList1 = new ArrayList();
        ActionEntity ae1 = new ActionEntity(new Long(0));
        ae1.setTransit(-1); // смерть
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
        p1.setText("Вам необходимо попасть в Скадовск. По какому же пути вы пойдете? <ol><li>на восток через реку</li><li>по дороге через лесопилку</li></ol>");
        p1.setActionList(actionList1);
        pageList1.add(p1);

        /// page 2
        ArrayList actionList2 = new ArrayList();
        ActionEntity ae1_1 = new ActionEntity(new Long(0));
        ae1_1.setTransit(3); // переход на  страницу 3
        ae1_1.setBandage(0);
        ae1_1.setGold(0);
        ae1_1.setRadiation(0);
        ae1_1.setCartridges(0);
        actionList2.add(ae1_1);

        ActionEntity ae2_1 = new ActionEntity(new Long(1));
        ae2_1.setTransit(4); // переход на страницу 4
        ae2_1.setBandage(0);
        ae2_1.setGold(0);
        ae2_1.setRadiation(0);
        ae2_1.setCartridges(0);
        //ae2.setTransit(-1);
        actionList2.add(ae2_1);

        PageEntity p2 = new PageEntity(new Long(1));
        p2.setTitle("Выбор 2");
        p2.setText("Вы не видите ни одного зомбированного на лесопилке. Кажется, кто-то успел все это зачистить. Но тут вам показалось, что кто-то есть внутри постройки. С другой стороны можно продолжить путь. Что вы предпримите? <ol><li>зайти к постройку</li><li>продолжить путь через мост</li></ol>");
        p2.setActionList(actionList2);
        pageList1.add(p2);

        /// page 3
        ArrayList actionList3 = new ArrayList();
        ActionEntity ae1_3 = new ActionEntity(new Long(0));
        ae1_3.setTransit(-1); // смерть
        ae1_3.setBandage(0);
        ae1_3.setGold(0);
        ae1_3.setRadiation(0);
        ae1_3.setCartridges(0);
        actionList3.add(ae1_3);

        PageEntity p3 = new PageEntity(new Long(3));
        p3.setTitle("Страница 3");
        p3.setText("Вы не заметили установленную растяжку. К сожалению вы взорвались на ней. <ol><li>далее</li></ol>");
        p3.setActionList(actionList3);
        pageList1.add(p3);

        /// page 4
        ArrayList actionList2_2 = new ArrayList();
        ActionEntity ae2_2 = new ActionEntity(new Long(0));
        ae2_2.setTransit(7); // переход на страницу 6
        ae2_2.setBandage(0);
        ae2_2.setGold(0);
        ae2_2.setRadiation(0);
        ae2_2.setCartridges(0);
        actionList2_2.add(ae2_2);

        ActionEntity ae2_3 = new ActionEntity(new Long(1));
        ae2_3.setTransit(5); // переход на  страницу 5
        ae2_3.setBandage(0);
        ae2_3.setGold(0);
        ae2_3.setRadiation(0);
        ae2_3.setCartridges(0);
        //ae2.setTransit(-1);
        actionList2_2.add(ae2_3);

        PageEntity p4 = new PageEntity(new Long(4));
        p4.setTitle("Выбор 3");
        p4.setText("Вы дошли до какого-то сгоревшего хутора. Вдруг вы услышали, как кто-то неподалеку от аномалии просит помощи. Звук доновится из кустов. Что вы сделаете? <ol><li>игнорировать и продолжить путь</li><li>проверите можете ли вы помочь</li></ol>");
        p4.setActionList(actionList2_2);
        pageList1.add(p4);

        /// page 5
        ArrayList actionList4 = new ArrayList();
        ActionEntity ae4_1 = new ActionEntity(new Long(0));
        ae4_1.setTransit(-1); // смерть
        ae4_1.setBandage(0);
        ae4_1.setGold(0);
        ae4_1.setRadiation(0);
        ae4_1.setCartridges(-5);
        actionList4.add(ae4_1);

        ActionEntity ae4_2 = new ActionEntity(new Long(1));
        ae4_2.setTransit(6); // переход на страницу 6
        ae4_2.setBandage(0);
        ae4_2.setGold(0);
        ae4_2.setRadiation(0);
        ae4_2.setCartridges(0);
        //ae2.setTransit(-1);
        actionList4.add(ae4_2);

        PageEntity p5 = new PageEntity(new Long(5));
        p5.setTitle("Выбор 4");
        p5.setText("Вы протиснулись сквозь высокие кусты, но неожиданно поняли, что вас заманили. Это оказался кот-болон, подражающий человеческой речи. Он резко прыгнул на вас как только вы подошли достаточно близко. Что вы сделаете? <ol><li>попытаться отбиться от кота (необходимо 5 патронов)</li><li>бежать (понадобится 2 аптечка)</li></ol>");
        p5.setActionList(actionList4);
        pageList1.add(p5);

        /// page 6
        ArrayList actionList5 = new ArrayList();
        ActionEntity ae5_1 = new ActionEntity(new Long(0));
        ae5_1.setTransit(7); // переход на  страницу 7
        ae5_1.setBandage(-1);
        ae5_1.setGold(0);
        ae5_1.setRadiation(0);
        ae5_1.setCartridges(0);
        actionList5.add(ae5_1);

        PageEntity p6 = new PageEntity(new Long(6));
        p6.setTitle("Страница 6");
        p6.setText("Вы бежали настолько быстро как позволяли ваши ноги. Вскоре вашему преследователю надоело за вами гоняться и он отстал. Вы присели, перевязали вашу несерьезную рану и снова двинулись к вашей цели <ol><li>далее</li></ol>");
        p6.setActionList(actionList5);
        pageList1.add(p6);

        /// page 7
        ArrayList actionList6 = new ArrayList();
        ActionEntity ae6_1 = new ActionEntity(new Long(0));
        ae6_1.setTransit(8); // переход на  страницу 8
        ae6_1.setBandage(0);
        ae6_1.setGold(0);
        ae6_1.setRadiation(0);
        ae6_1.setCartridges(0);
        actionList6.add(ae6_1);

        ActionEntity ae6_2 = new ActionEntity(new Long(1));
        ae6_2.setTransit(11); // переход на страницу 11
        ae6_2.setBandage(0);
        ae6_2.setGold(0);
        ae6_2.setRadiation(0);
        ae6_2.setCartridges(0);
        actionList6.add(ae6_2);

        PageEntity p7 = new PageEntity(new Long(7));
        p7.setTitle("Выбор 5");
        p7.setText("Вы идете дальше по направлению к Скадовску и неожиданно перед вами появляется пролом в земле. Выглядит он крайне заманчиво, так как сразу видно, что там еще никого не было, но кто знает кто вас там может встретить. Что вы сделаете?<ol><li>попытать счастье и полезть в пролом</li><li>пройти мимо</li></ol>");
        p7.setActionList(actionList6);
        pageList1.add(p7);

        /// page 8
        ArrayList actionList7 = new ArrayList();
        ActionEntity ae7_1 = new ActionEntity(new Long(0));
        ae7_1.setTransit(9); // переход на  страницу 9
        ae7_1.setBandage(0);
        ae7_1.setGold(0);
        ae7_1.setRadiation(0);
        ae7_1.setCartridges(0);
        actionList7.add(ae7_1);

        ActionEntity ae7_2 = new ActionEntity(new Long(0));
        ae7_2.setTransit(10); // переход на страницу 10
        ae7_2.setBandage(0);
        ae7_2.setGold(0);
        ae7_2.setRadiation(-1);
        ae7_2.setCartridges(0);
        actionList7.add(ae7_2);

        PageEntity p8 = new PageEntity(new Long(8));
        p8.setTitle("Выбор 5_1");
        p8.setText("Вы решили сыграть с судьбой и полезли в разлом. Практически сразу после этого вы поняли, что, возможно, это был нелучший выбор. Но вроде было все тихо. Вдобавок шкала рациации неожиданно вышла из-под контроля и теперь вам нужно воспользоваться рад-комплектом, чтобы привести себя в норму. Что вы сделаете? <ol><li>остаться исследовать пролом</li><li>развернуться и вылезти обратно на поверхность (нужен 1 рад-комплект)</li></ol>");
        p8.setActionList(actionList7);
        pageList1.add(p8);

        /// page 9
        ArrayList actionList8 = new ArrayList();
        ActionEntity ae8 = new ActionEntity(new Long(0));
        ae8.setTransit(-1); // смерть
        ae8.setBandage(0);
        ae8.setGold(0);
        ae8.setRadiation(0);
        ae8.setCartridges(0);
        actionList8.add(ae8);

        PageEntity p9 = new PageEntity(new Long(9));
        p9.setTitle("Страница 9");
        p9.setText("Вы игнорируете голос разума и идете вперед. Минут через 10 такой прогулки на вас из-за угла набрасывается контролёр. Теперь вы его обед.<ol><li>Далее</li></ol>");
        p9.setActionList(actionList8);
        pageList1.add(p9);

        /// page 10
        ArrayList actionList9 = new ArrayList();
        ActionEntity ae9 = new ActionEntity(new Long(0));
        ae9.setTransit(11); // переход на страницу 11
        ae9.setBandage(0);
        ae9.setGold(0);
        ae9.setRadiation(0);
        ae9.setCartridges(0);
        actionList9.add(ae9);

        PageEntity p10 = new PageEntity(new Long(10));
        p10.setTitle("Страница 10");
        p10.setText("Вы вылазите из этого разлома, думая, что лучше не рисковать.<ol><li>Далее</li></ol>");
        p10.setActionList(actionList9);
        pageList1.add(p10);

        /// page 11
        ArrayList actionList10 = new ArrayList();
        ActionEntity ae10 = new ActionEntity(new Long(0));
        ae10.setTransit(12); // переход на страницу 12
        ae10.setBandage(0);
        ae10.setGold(0);
        ae10.setRadiation(0);
        ae10.setCartridges(0);
        actionList10.add(ae10);

        PageEntity p11 = new PageEntity(new Long(11));
        p11.setTitle("Страница 11");
        p11.setText("Вы прибыли на место. Наконец-то я дошел, подумали вы про себя. Недолго думая, вы пошли в бар, так как именно там почти всегда находится Султан.<ol><li>Далее</li></ol>");
        p11.setActionList(actionList10);
        pageList1.add(p11);

        /// page 12
        ArrayList actionList11 = new ArrayList();
        ActionEntity ae11_1 = new ActionEntity(new Long(0));
        ae11_1.setTransit(13); // переход на  страницу 13
        ae11_1.setBandage(0);
        ae11_1.setGold(0);
        ae11_1.setRadiation(0);
        ae11_1.setCartridges(0);
        actionList11.add(ae11_1);

        ActionEntity ae11_2 = new ActionEntity(new Long(0));
        ae11_2.setTransit(14); // переход на страницу 14
        ae11_2.setBandage(0);
        ae11_2.setGold(0);
        ae11_2.setRadiation(0);
        ae11_2.setCartridges(0);
        actionList11.add(ae11_2);

        PageEntity p12 = new PageEntity(new Long(12));
        p12.setTitle("Выбор 6");
        p12.setText("Как вы и думали, он был именно здесь. Сразу после приветствия Султан решил поинтересоваться о вашем пути. <ol><li>рассказать про битву с котом-баюном</li><li>рассказать о проломе</li></ol>");
        p12.setActionList(actionList11);
        pageList1.add(p12);

        /// page 13
        ArrayList actionList12 = new ArrayList();
        ActionEntity ae12 = new ActionEntity(new Long(0));
        ae12.setTransit(15); // переход на страницу 15
        ae12.setBandage(0);
        ae12.setGold(0);
        ae12.setRadiation(0);
        ae12.setCartridges(0);
        actionList12.add(ae12);

        PageEntity p13 = new PageEntity(new Long(13));
        p13.setTitle("Страница 13");
        p13.setText("Ну ты забавный. Все же знают про него. Ладно, дуй к Сычу, он тебя давно уже ждет!<ol><li>Далее</li></ol>");
        p13.setActionList(actionList12);
        pageList1.add(p13);

        /// page 14
        ArrayList actionList13 = new ArrayList();
        ActionEntity ae13 = new ActionEntity(new Long(0));
        ae13.setTransit(15); // переход на страницу 15
        ae13.setBandage(0);
        ae13.setGold(0);
        ae13.setRadiation(0);
        ae13.setCartridges(0);
        actionList13.add(ae13);

        PageEntity p14 = new PageEntity(new Long(14));
        p14.setTitle("Страница 14");
        p14.setText("И хорошо, что не совался туда. Ходят слухи, что там толпень кровососов, так туда боятся заглядывать вообще все. Ладно, дуй к Сычу, он тебя давно уже ждет!<ol><li>Далее</li></ol>");
        p14.setActionList(actionList13);
        pageList1.add(p14);

        /// page 15
        ArrayList actionList14 = new ArrayList();
        ActionEntity ae14 = new ActionEntity(new Long(0));
        ae14.setTransit(16); // переход на страницу 15
        ae14.setBandage(0);
        ae14.setGold(0);
        ae14.setRadiation(0);
        ae14.setCartridges(0);
        actionList14.add(ae14);

        PageEntity p15 = new PageEntity(new Long(15));
        p15.setTitle("Страница 15");
        p15.setText("Вы подошли к Сычу. По его лицу было видно, что ждет вас он давно. Вы отдали пакет и он заметно повеселел. Снаряжение, которое вы несли, оказалось что надо. 'За мной не пропадет'- недолго думая, сказал Сыч.<ol><li>Далее</li></ol>");
        p15.setActionList(actionList14);
        pageList1.add(p15);

        ScriptEntity se = new ScriptEntity(new Long(2));
        se.setName("2");
        se.setPageList(pageList1);
        se.setEndPage(new Long(15));
        se.setDescription("Вы прибыли в Северо-западную часть Затона. Вам нужно отнести рюкзак, который вам дали ранее. 'Ты, давай, быстрей чеши на Скадовск. И да, это самое. Через лесопилку не ходи, а то к зомбякам попадешь! Ха-ха.'");
        return se;
    }
}
