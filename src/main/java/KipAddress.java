import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("WeakerAccess")
@DatabaseTable(tableName = "objects")
public class KipAddress {
    // for QueryBuilder to be able to find the fields
    //public static final String _FIELD_NAME = "";
    public static final String N_DINAM_FIELD_NAME = "N_dinam";
    public static final String STREET_FIELD_NAME = "Adres_doma";
    public static final String HOUSE_FIELD_NAME = "Num_Doma";
    public static final String KORP_FIELD_NAME = "Num_korp";
    public static final String JEU_FIELD_NAME = "Num_jeu";
    public static final String SISTEMA_FIELD_NAME = "Sistema";
    public static final String MARKA_FIELD_NAME = "Marka_Pribor";
    public static final String DATA_VIPUSK_FIELD_NAME = "Data_Vipuska_IVB";
    public static final String DATA_USTANOV_FIELD_NAME = "Data_Ustanovki";
    public static final String SHEMA_FIELD_NAME = "Shema";
    public static final String IMG_GVS_FIELD_NAME = "IMG_GVS";
    public static final String IMG_OT_FIELD_NAME = "IMG_OT";
    public static final String SNYAT_FIELD_NAME = "a_snyat";
    public static final String OTVEZEN_FIELD_NAME = "a_otvezen";
    public static final String PRIVEZEN_FIELD_NAME = "a_Privesen";
    public static final String POSTAVLEN_FIELD_NAME = "a_Postavlen";
    public static final String IVB_FIELD_NAME = "Num_IVB";
    public static final String TYPE_PPR_FIELD_NAME = "Typ_PPR";
    public static final String PPR1_FIELD_NAME = "Num_PPR1";
    public static final String PPR2_FIELD_NAME = "Num_PPR2";
    public static final String PPR3_FIELD_NAME = "Num_PPR3";
    public static final String D1_FIELD_NAME = "Diam_1";
    public static final String D2_FIELD_NAME = "Diam_2";
    public static final String D3_FIELD_NAME = "Diam_3";
    public static final String TYPE_TSP_GVS_FIELD_NAME = "TYP_TSP_GVS";
    public static final String TYPE_TSP_OT_FIELD_NAME = "TYP_TSP_OT";
    public static final String NTSP1_FIELD_NAME = "Num_TSP1";
    public static final String NTSP2_FIELD_NAME = "Num_TSP2";
    public static final String NTSP3_FIELD_NAME = "Num_TSP3";
    public static final String NTSP4_FIELD_NAME = "Num_TSP4";
    public static final String NTSP5_FIELD_NAME = "Num_TSP5";
    public static final String XV_FIELD_NAME = "XV_prog";
    public static final String XV5_FIELD_NAME = "prog_XV";
    public static final String D_GVS_FIELD_NAME = "Diap_GVS";
    public static final String D_OT_FIELD_NAME = "Diap_OT";
    public static final String ST_GVS_FIELD_NAME = "Status_GVS";
    public static final String ST_OT_FIELD_NAME = "Status_OT";
    public static final String UCH_IN_GVS_FIELD_NAME = "Data_Post_Uch_GVS";
    public static final String UCH_OUT_GVS_FIELD_NAME = "Data_Sn_Uch_GVS";
    public static final String UCH_IN_OT_FIELD_NAME = "Data_Post_Uch_OT";
    public static final String UCH_OUT_OT_FIELD_NAME = "Data_Sn_Uch_OT";
    public static final String POV_IVB_FIELD_NAME = "Data_Poverki_IVB";
    public static final String NEXT_POV_IVB_FIELD_NAME = "Data_Sled_Poverki_IVB";
    public static final String POV_RSM_FIELD_NAME = "Data_Poverki_RSM";
    public static final String NEXT_POV_RSM_FIELD_NAME = "Data_Sled_Poverki_RSM";
    public static final String DSN_POV_FIELD_NAME = "Data_SN_Poverka";
    public static final String DPRIV_POV_FIELD_NAME = "Data_Privoza_S_Poverki";
    public static final String POVERITEL_FIELD_NAME = "Naim_poveritelya";
    public static final String STAT_POV_FIELD_NAME = "Status_Poverki";
    public static final String REG_NUM_OT_FIELD_NAME = "Num_REG_OT";
    public static final String REG_NUM_GVS_FIELD_NAME = "Num_REG_GVS";
    public static final String AREA_FIELD_NAME = "Ploschad_Doma";
    public static final String HUMAN_FIELD_NAME = "Kol_Jilcov";
    public static final String FLAT_QUANTITY_FIELD_NAME = "Kol_kvartir";
    public static final String KOMM_FIELD_NAME = "Kommentarii";
    public static final String SELECT_DOM_FIELD_NAME = "Select_Dom";
    public static final String PRQGVS_FIELD_NAME = "Pr_Q_GVS";
    public static final String PRVGVS_FIELD_NAME = "Pr_V_GVS";
    public static final String PRQOT_FIELD_NAME = "Pr_Q_OT";
    public static final String PRVOT_FIELD_NAME = "Pr_V_OT";
    public static final String POV_TSP_GVS_FIELD_NAME = "POVERKA_TSP_GVS";
    public static final String NEXT_POV_TSP_GVS_FIELD_NAME = "SL_POVERKA_TSP_GVS";
    public static final String POV_TSP_OT_FIELD_NAME = "POVERKA_TSP_OT";
    public static final String NEXT_POV_TSP_OT_FIELD_NAME = "SL_POVERKA_TSP_OT";
    public static final String G_GVS_FIELD_NAME = "Mgnov_proekt_GVS";
    public static final String G_OT_FIELD_NAME = "Mgnov_proekt_OT";
    public static final String BERN_GVS_FIELD_NAME = "Mgnov_BERN_GVS";
    public static final String BERN_OT_FIELD_NAME = "Mgnov_BERN_OT";
    public static final String INV_NUM_FIELD_NAME = "Num_INVENT";
    public static final String PERIOD_IVB_FIELD_NAME = "Period_IVB";
    public static final String PERIOD_TSP_GVS_FIELD_NAME = "Period_TSPGVS";
    public static final String PERIOD_TSP_OT_FIELD_NAME = "Period_TSPOT";
    public static final String PERIOS_RSM_FIELD_NAME = "Period_RSM";
    public static final String ETALON_FIELD_NAME = "Etalon";
    public static final String SERIA_FIELD_NAME = "Seriya";
    public static final String TEPOV_NAGR_FIELD_NAME = "Tepov_Nagr";
    public static final String TEPLOV_HAGR_FIELD_NAME = "Teplov_Nagr1";
    public static final String SIM1_FIELD_NAME = "SIM1";
    public static final String SIM2_FIELD_NAME = "SIM2";
    public static final String SIM3_FIELD_NAME = "SIM3";
    private List<KipAddress> objectusList = new ArrayList<KipAddress>();
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = N_DINAM_FIELD_NAME)
    private String n_dinam;

    @DatabaseField(columnName = STREET_FIELD_NAME, canBeNull = false)
    private String street;

    @DatabaseField(columnName = HOUSE_FIELD_NAME)
    private String house;

    @DatabaseField(columnName = KORP_FIELD_NAME)
    private String korpus;

    @DatabaseField(columnName = JEU_FIELD_NAME)
    private String jeu;

    @DatabaseField(columnName = SISTEMA_FIELD_NAME)
    private String sistema;

    @DatabaseField(columnName = MARKA_FIELD_NAME)
    private String marka;

    @DatabaseField(columnName = DATA_VIPUSK_FIELD_NAME)
    private String birdth;

    @DatabaseField(columnName = DATA_USTANOV_FIELD_NAME)
    private String mount;

    @DatabaseField(columnName = SHEMA_FIELD_NAME)
    private String shema;

    @DatabaseField(columnName = IMG_GVS_FIELD_NAME)
    private String img_gvs;

    @DatabaseField(columnName = IMG_OT_FIELD_NAME)
    private String img_ot;

    @DatabaseField(columnName = SNYAT_FIELD_NAME)
    private String snyatie;

    @DatabaseField(columnName = OTVEZEN_FIELD_NAME)
    private String otvez;

    @DatabaseField(columnName = PRIVEZEN_FIELD_NAME)
    private String privez;

    @DatabaseField(columnName = POSTAVLEN_FIELD_NAME)
    private String postav;

    @DatabaseField(columnName = IVB_FIELD_NAME)
    private String ivb;

    @DatabaseField(columnName = TYPE_PPR_FIELD_NAME)
    private String type_ppr;

    @DatabaseField(columnName = PPR1_FIELD_NAME)
    private String ppr1;

    @DatabaseField(columnName = PPR2_FIELD_NAME)
    private String ppr2;

    @DatabaseField(columnName = PPR3_FIELD_NAME)
    private String ppr3;

    @DatabaseField(columnName = D1_FIELD_NAME)
    private String d1;

    @DatabaseField(columnName = D2_FIELD_NAME)
    private String d2;

    @DatabaseField(columnName = D3_FIELD_NAME)
    private String d3;

    @DatabaseField(columnName = TYPE_TSP_GVS_FIELD_NAME)
    private String type_tsp_gvs;

    @DatabaseField(columnName = TYPE_TSP_OT_FIELD_NAME)
    private String type_tsp_ot;

    @DatabaseField(columnName = NTSP1_FIELD_NAME)
    private String tsp1;

    @DatabaseField(columnName = NTSP2_FIELD_NAME)
    private String tsp2;

    @DatabaseField(columnName = NTSP3_FIELD_NAME)
    private String tsp3;

    @DatabaseField(columnName = NTSP4_FIELD_NAME)
    private String tsp4;

    @DatabaseField(columnName = NTSP5_FIELD_NAME)
    private String tsp5;

    @DatabaseField(columnName = XV_FIELD_NAME)
    private String tvx;

    @DatabaseField(columnName = XV5_FIELD_NAME)
    private String xv5;

    @DatabaseField(columnName = D_GVS_FIELD_NAME)
    private String du_gvx;

    @DatabaseField(columnName = D_OT_FIELD_NAME)
    private String du_ot;

    @DatabaseField(columnName = ST_GVS_FIELD_NAME)
    private String status_gvs;

    @DatabaseField(columnName = ST_OT_FIELD_NAME)
    private String status_ot;

    @DatabaseField(columnName = UCH_IN_GVS_FIELD_NAME)
    private String uchet_gvs;

    @DatabaseField(columnName = UCH_OUT_GVS_FIELD_NAME)
    private String sucheta_gvs;

    @DatabaseField(columnName = UCH_IN_OT_FIELD_NAME)
    private String uchet_ot;

    @DatabaseField(columnName = UCH_OUT_OT_FIELD_NAME)
    private String sucheta_ot;

    @DatabaseField(columnName = POV_IVB_FIELD_NAME)
    private String poverka_ivb;

    @DatabaseField(columnName = NEXT_POV_IVB_FIELD_NAME)
    private String next_poverka_ivb;

    @DatabaseField(columnName = POV_RSM_FIELD_NAME)
    private String poverka_rsm;

    @DatabaseField(columnName = NEXT_POV_RSM_FIELD_NAME)
    private String next_poverka_rsm;

    @DatabaseField(columnName = DSN_POV_FIELD_NAME)
    private String data_snatia;

    @DatabaseField(columnName = DPRIV_POV_FIELD_NAME)
    private String privoz;

    @DatabaseField(columnName = POVERITEL_FIELD_NAME)
    private String poveritel;

    @DatabaseField(columnName = STAT_POV_FIELD_NAME)
    private String status_poverki;

    @DatabaseField(columnName = REG_NUM_OT_FIELD_NAME)
    private String reg_ot;

    @DatabaseField(columnName = REG_NUM_GVS_FIELD_NAME)
    private String reg_gvs;

    @DatabaseField(columnName = AREA_FIELD_NAME)
    private String area;

    @DatabaseField(columnName = HUMAN_FIELD_NAME)
    private String human;

    @DatabaseField(columnName = FLAT_QUANTITY_FIELD_NAME)
    private String flatquan;

    @DatabaseField(columnName = KOMM_FIELD_NAME)
    private String komment;

    @DatabaseField(columnName = SELECT_DOM_FIELD_NAME)
    private String sel_dom;

    @DatabaseField(columnName = PRQGVS_FIELD_NAME)
    private String prqgvs;

    @DatabaseField(columnName = PRVGVS_FIELD_NAME)
    private String prvgvs;

    @DatabaseField(columnName = PRQOT_FIELD_NAME)
    private String prqot;

    @DatabaseField(columnName = PRVOT_FIELD_NAME)
    private String prvot;

    @DatabaseField(columnName = POV_TSP_OT_FIELD_NAME)
    private String poverka_tsp_ot;

    @DatabaseField(columnName = NEXT_POV_TSP_OT_FIELD_NAME)
    private String next_poverka_tsp_ot;

    @DatabaseField(columnName = POV_TSP_GVS_FIELD_NAME)
    private String poverka_tsp_gvs;

    @DatabaseField(columnName = NEXT_POV_TSP_GVS_FIELD_NAME)
    private String next_poverka_tsp_gvs;

    @DatabaseField(columnName = G_GVS_FIELD_NAME)
    private String g_proekt_gvs;

    @DatabaseField(columnName = G_OT_FIELD_NAME)
    private String getG_proekt_ot;

    @DatabaseField(columnName = BERN_GVS_FIELD_NAME)
    private String bern_gvs;

    @DatabaseField(columnName = BERN_OT_FIELD_NAME)
    private String bern_ot;

    @DatabaseField(columnName = INV_NUM_FIELD_NAME)
    private String inv_num;

    @DatabaseField(columnName = PERIOD_IVB_FIELD_NAME)
    private String period_ivb;

    @DatabaseField(columnName = PERIOS_RSM_FIELD_NAME)
    private String period_rsm;

    @DatabaseField(columnName = PERIOD_TSP_GVS_FIELD_NAME)
    private String period_tsp_gvs;

    @DatabaseField(columnName = PERIOD_TSP_OT_FIELD_NAME)
    private String perios_tsp_ot;

    @DatabaseField(columnName = ETALON_FIELD_NAME)
    private String etalon;

    @DatabaseField(columnName = SERIA_FIELD_NAME)
    private String seria;

    @DatabaseField(columnName = TEPOV_NAGR_FIELD_NAME)
    private String tepov;

    @DatabaseField(columnName = TEPLOV_HAGR_FIELD_NAME)
    private String teplov;

    @DatabaseField(columnName = SIM1_FIELD_NAME)
    private String sim1;

    @DatabaseField(columnName = SIM2_FIELD_NAME)
    private String sim2;

    @DatabaseField(columnName = SIM3_FIELD_NAME)
    private String sim3;

    KipAddress() {
        // all persisted classes must define a no-arg constructor with at least package visibility
    }

    public KipAddress(int id, String n_dinam, String street, String house, String korpus, String jeu, String sistema, String marka, String birdth, String mount, String shema, String img_gvs, String img_ot, String snyatie, String otvez, String privez, String postav, String ivb, String type_ppr, String ppr1, String ppr2, String ppr3, String d1, String d2, String d3, String type_tsp_gvs, String type_tsp_ot, String tsp1, String tsp2, String tsp3, String tsp4, String tsp5, String tvx, String xv5, String du_gvx, String du_ot, String status_gvs, String status_ot, String uchet_gvs, String sucheta_gvs, String uchet_ot, String sucheta_ot, String poverka_ivb, String next_poverka_ivb, String poverka_rsm, String next_poverka_rsm, String data_snatia, String privoz, String poveritel, String status_poverki, String reg_ot, String reg_gvs, String area, String human, String flatquan, String komment, String sel_dom, String prqgvs, String prvgvs, String prqot, String prvot, String poverka_tsp_ot, String next_poverka_tsp_ot, String poverka_tsp_gvs, String next_poverka_tsp_gvs, String g_proekt_gvs, String getG_proekt_ot, String bern_gvs, String bern_ot, String inv_num, String period_ivb, String period_rsm, String period_tsp_gvs, String perios_tsp_ot, String etalon, String seria, String tepov, String teplov, String sim1, String sim2, String sim3) {
        this.id = id;
        this.n_dinam = n_dinam;
        this.street = street;
        this.house = house;
        this.korpus = korpus;
        this.jeu = jeu;
        this.sistema = sistema;
        this.marka = marka;
        this.birdth = birdth;
        this.mount = mount;
        this.shema = shema;
        this.img_gvs = img_gvs;
        this.img_ot = img_ot;
        this.snyatie = snyatie;
        this.otvez = otvez;
        this.privez = privez;
        this.postav = postav;
        this.ivb = ivb;
        this.type_ppr = type_ppr;
        this.ppr1 = ppr1;
        this.ppr2 = ppr2;
        this.ppr3 = ppr3;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.type_tsp_gvs = type_tsp_gvs;
        this.type_tsp_ot = type_tsp_ot;
        this.tsp1 = tsp1;
        this.tsp2 = tsp2;
        this.tsp3 = tsp3;
        this.tsp4 = tsp4;
        this.tsp5 = tsp5;
        this.tvx = tvx;
        this.xv5 = xv5;
        this.du_gvx = du_gvx;
        this.du_ot = du_ot;
        this.status_gvs = status_gvs;
        this.status_ot = status_ot;
        this.uchet_gvs = uchet_gvs;
        this.sucheta_gvs = sucheta_gvs;
        this.uchet_ot = uchet_ot;
        this.sucheta_ot = sucheta_ot;
        this.poverka_ivb = poverka_ivb;
        this.next_poverka_ivb = next_poverka_ivb;
        this.poverka_rsm = poverka_rsm;
        this.next_poverka_rsm = next_poverka_rsm;
        this.data_snatia = data_snatia;
        this.privoz = privoz;
        this.poveritel = poveritel;
        this.status_poverki = status_poverki;
        this.reg_ot = reg_ot;
        this.reg_gvs = reg_gvs;
        this.area = area;
        this.human = human;
        this.flatquan = flatquan;
        this.komment = komment;
        this.sel_dom = sel_dom;
        this.prqgvs = prqgvs;
        this.prvgvs = prvgvs;
        this.prqot = prqot;
        this.prvot = prvot;
        this.poverka_tsp_ot = poverka_tsp_ot;
        this.next_poverka_tsp_ot = next_poverka_tsp_ot;
        this.poverka_tsp_gvs = poverka_tsp_gvs;
        this.next_poverka_tsp_gvs = next_poverka_tsp_gvs;
        this.g_proekt_gvs = g_proekt_gvs;
        this.getG_proekt_ot = getG_proekt_ot;
        this.bern_gvs = bern_gvs;
        this.bern_ot = bern_ot;
        this.inv_num = inv_num;
        this.period_ivb = period_ivb;
        this.period_rsm = period_rsm;
        this.period_tsp_gvs = period_tsp_gvs;
        this.perios_tsp_ot = perios_tsp_ot;
        this.etalon = etalon;
        this.seria = seria;
        this.tepov = tepov;
        this.teplov = teplov;
        this.sim1 = sim1;
        this.sim2 = sim2;
        this.sim3 = sim3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getN_dinam() {
        return n_dinam;
    }

    public void setN_dinam(String n_dinam) {
        this.n_dinam = n_dinam;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }


    public String getKorpus() {
        return korpus;
    }

    public void setKorpus(String korpus) {
        this.korpus = korpus;
    }

    public String getJeu() {
        return jeu;
    }

    public void setJeu(String jeu) {
        this.jeu = jeu;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBirdth() {
        return birdth;
    }

    public void setBirdth(String birdth) {
        this.birdth = birdth;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    public String getShema() {
        return shema;
    }

    public void setShema(String shema) {
        this.shema = shema;
    }

    public String getImg_gvs() {
        return img_gvs;
    }

    public void setImg_gvs(String img_gvs) {
        this.img_gvs = img_gvs;
    }

    public String getImg_ot() {
        return img_ot;
    }

    public void setImg_ot(String img_ot) {
        this.img_ot = img_ot;
    }

    public String getSnyatie() {
        return snyatie;
    }

    public void setSnyatie(String snyatie) {
        this.snyatie = snyatie;
    }

    public String getOtvez() {
        return otvez;
    }

    public void setOtvez(String otvez) {
        this.otvez = otvez;
    }

    public String getPrivez() {
        return privez;
    }

    public void setPrivez(String privez) {
        this.privez = privez;
    }

    public String getPostav() {
        return postav;
    }

    public void setPostav(String postav) {
        this.postav = postav;
    }

    public String getIvb() {
        return ivb;
    }

    public void setIvb(String ivb) {
        this.ivb = ivb;
    }

    public String getType_ppr() {
        return type_ppr;
    }

    public void setType_ppr(String type_ppr) {
        this.type_ppr = type_ppr;
    }

    public String getPpr1() {
        return ppr1;
    }

    public void setPpr1(String ppr1) {
        this.ppr1 = ppr1;
    }

    public String getPpr2() {
        return ppr2;
    }

    public void setPpr2(String ppr2) {
        this.ppr2 = ppr2;
    }

    public String getPpr3() {
        return ppr3;
    }

    public void setPpr3(String ppr3) {
        this.ppr3 = ppr3;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getType_tsp_gvs() {
        return type_tsp_gvs;
    }

    public void setType_tsp_gvs(String type_tsp_gvs) {
        this.type_tsp_gvs = type_tsp_gvs;
    }

    public String getType_tsp_ot() {
        return type_tsp_ot;
    }

    public void setType_tsp_ot(String type_tsp_ot) {
        this.type_tsp_ot = type_tsp_ot;

    }

    public String getTsp1() {
        return tsp1;
    }

    public void setTsp1(String tsp1) {
        this.tsp1 = tsp1;
    }

    public String getTsp2() {
        return tsp2;
    }

    public void setTsp2(String tsp2) {
        this.tsp2 = tsp2;
    }

    public String getTsp3() {
        return tsp3;
    }

    public void setTsp3(String tsp3) {
        this.tsp3 = tsp3;
    }

    public String getTsp4() {
        return tsp4;
    }

    public void setTsp4(String tsp4) {
        this.tsp4 = tsp4;
    }

    public String getTsp5() {
        return tsp5;
    }

    public void setTsp5(String tsp5) {
        this.tsp5 = tsp5;
    }

    public String getTvx() {
        return tvx;
    }

    public void setTvx(String tvx) {
        this.tvx = tvx;
    }

    public String getXv5() {
        return xv5;
    }

    public void setXv5(String xv5) {
        this.xv5 = xv5;
    }

    public String getDu_gvx() {
        return du_gvx;
    }

    public void setDu_gvx(String du_gvx) {
        this.du_gvx = du_gvx;
    }

    public String getDu_ot() {
        return du_ot;
    }

    public void setDu_ot(String du_ot) {
        this.du_ot = du_ot;
    }

    public String getStatus_gvs() {
        return status_gvs;
    }

    public void setStatus_gvs(String status_gvs) {
        this.status_gvs = status_gvs;
    }

    public String getStatus_ot() {
        return status_ot;
    }

    public void setStatus_ot(String status_ot) {
        this.status_ot = status_ot;
    }

    public String getUchet_gvs() {
        return uchet_gvs;
    }

    public void setUchet_gvs(String uchet_gvs) {
        this.uchet_gvs = uchet_gvs;
    }

    public String getSucheta_gvs() {
        return sucheta_gvs;
    }

    public void setSucheta_gvs(String sucheta_gvs) {
        this.sucheta_gvs = sucheta_gvs;
    }

    public String getUchet_ot() {
        return uchet_ot;
    }

    public void setUchet_ot(String uchet_ot) {
        this.uchet_ot = uchet_ot;
    }

    public String getSucheta_ot() {
        return sucheta_ot;
    }

    public void setSucheta_ot(String sucheta_ot) {
        this.sucheta_ot = sucheta_ot;
    }

    public String getPoverka_ivb() {
        return poverka_ivb;
    }

    public void setPoverka_ivb(String poverka_ivb) {
        this.poverka_ivb = poverka_ivb;
    }

    public String getNext_poverka_ivb() {
        return next_poverka_ivb;
    }

    public void setNext_poverka_ivb(String next_poverka_ivb) {
        this.next_poverka_ivb = next_poverka_ivb;
    }

    public String getPoverka_rsm() {
        return poverka_rsm;
    }

    public void setPoverka_rsm(String poverka_rsm) {
        this.poverka_rsm = poverka_rsm;
    }

    public String getNext_poverka_rsm() {
        return next_poverka_rsm;
    }

    public void setNext_poverka_rsm(String next_poverka_rsm) {
        this.next_poverka_rsm = next_poverka_rsm;
    }

    public String getData_snatia() {
        return data_snatia;
    }

    public void setData_snatia(String data_snatia) {
        this.data_snatia = data_snatia;
    }

    public String getPrivoz() {
        return privoz;
    }

    public void setPrivoz(String privoz) {
        this.privoz = privoz;
    }

    public String getPoveritel() {
        return poveritel;
    }

    public void setPoveritel(String poveritel) {
        this.poveritel = poveritel;
    }

    public String getStatus_poverki() {
        return status_poverki;
    }

    public void setStatus_poverki(String status_poverki) {
        this.status_poverki = status_poverki;
    }

    public String getReg_ot() {
        return reg_ot;
    }

    public void setReg_ot(String reg_ot) {
        this.reg_ot = reg_ot;
    }

    public String getReg_gvs() {
        return reg_gvs;
    }

    public void setReg_gvs(String reg_gvs) {
        this.reg_gvs = reg_gvs;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    public String getFlatquan() {
        return flatquan;
    }

    public void setFlatquan(String flatquan) {
        this.flatquan = flatquan;
    }

    public String getKomment() {
        return komment;
    }

    public void setKomment(String komment) {
        this.komment = komment;
    }

    public String getSel_dom() {
        return sel_dom;
    }

    public void setSel_dom(String sel_dom) {
        this.sel_dom = sel_dom;
    }

    public String getPrqgvs() {
        return prqgvs;
    }

    public void setPrqgvs(String prqgvs) {
        this.prqgvs = prqgvs;
    }

    public String getPrvgvs() {
        return prvgvs;
    }

    public void setPrvgvs(String prvgvs) {
        this.prvgvs = prvgvs;
    }

    public String getPrqot() {
        return prqot;
    }

    public void setPrqot(String prqot) {
        this.prqot = prqot;
    }

    public String getPrvot() {
        return prvot;
    }

    public void setPrvot(String prvot) {
        this.prvot = prvot;
    }

    public String getPoverka_tsp_ot() {
        return poverka_tsp_ot;
    }

    public void setPoverka_tsp_ot(String poverka_tsp_ot) {
        this.poverka_tsp_ot = poverka_tsp_ot;
    }

    public String getNext_poverka_tsp_ot() {
        return next_poverka_tsp_ot;
    }

    public void setNext_poverka_tsp_ot(String next_poverka_tsp_ot) {
        this.next_poverka_tsp_ot = next_poverka_tsp_ot;
    }

    public String getPoverka_tsp_gvs() {
        return poverka_tsp_gvs;
    }

    public void setPoverka_tsp_gvs(String poverka_tsp_gvs) {
        this.poverka_tsp_gvs = poverka_tsp_gvs;
    }

    public String getNext_poverka_tsp_gvs() {
        return next_poverka_tsp_gvs;
    }

    public void setNext_poverka_tsp_gvs(String next_poverka_tsp_gvs) {
        this.next_poverka_tsp_gvs = next_poverka_tsp_gvs;
    }

    public String getG_proekt_gvs() {
        return g_proekt_gvs;
    }

    public void setG_proekt_gvs(String g_proekt_gvs) {
        this.g_proekt_gvs = g_proekt_gvs;
    }

    public String getGetG_proekt_ot() {
        return getG_proekt_ot;
    }

    public void setGetG_proekt_ot(String getG_proekt_ot) {
        this.getG_proekt_ot = getG_proekt_ot;
    }

    public String getBern_gvs() {
        return bern_gvs;
    }

    public void setBern_gvs(String bern_gvs) {
        this.bern_gvs = bern_gvs;
    }

    public String getBern_ot() {
        return bern_ot;
    }

    public void setBern_ot(String bern_ot) {
        this.bern_ot = bern_ot;
    }

    public String getInv_num() {
        return inv_num;
    }

    public void setInv_num(String inv_num) {
        this.inv_num = inv_num;
    }

    public String getPeriod_ivb() {
        return period_ivb;
    }

    public void setPeriod_ivb(String period_ivb) {
        this.period_ivb = period_ivb;
    }

    public String getPeriod_rsm() {
        return period_rsm;
    }

    public void setPeriod_rsm(String period_rsm) {
        this.period_rsm = period_rsm;
    }

    public String getPeriod_tsp_gvs() {
        return period_tsp_gvs;
    }

    public void setPeriod_tsp_gvs(String period_tsp_gvs) {
        this.period_tsp_gvs = period_tsp_gvs;
    }

    public String getPerios_tsp_ot() {
        return perios_tsp_ot;
    }

    public void setPerios_tsp_ot(String perios_tsp_ot) {
        this.perios_tsp_ot = perios_tsp_ot;
    }

    public String getEtalon() {
        return etalon;
    }

    public void setEtalon(String etalon) {
        this.etalon = etalon;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getTepov() {
        return tepov;
    }

    public void setTepov(String tepov) {
        this.tepov = tepov;
    }

    public String getTeplov() {
        return teplov;
    }

    public void setTeplov(String teplov) {
        this.teplov = teplov;
    }

    public String getSim1() {
        return sim1;
    }

    public void setSim1(String sim1) {
        this.sim1 = sim1;
    }

    public String getSim2() {
        return sim2;
    }

    public void setSim2(String sim2) {
        this.sim2 = sim2;
    }

    public String getSim3() {
        return sim3;
    }

    public void setSim3(String sim3) {
        this.sim3 = sim3;
    }
    @SuppressWarnings("unchecked")
    public List<KipAddress> list() {
        return new ArrayList(objectusList);
    }


    @Override
    public int hashCode() {
        return street.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other.getClass() != getClass()) {
            return false;
        }
        return street.equals(((KipAddress) other).street);
    }


}