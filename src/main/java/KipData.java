import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("WeakerAccess")
@DatabaseTable(tableName = "data")
public class KipData {

    public static final String IVB_FIELD_NAME = "ivb";
    public static final String SYS_FIELD_NAME = "system";
    public static final String DATE_FIELD_NAME = "date";
    public static final String TIME_FIELD_NAME = "time";
    public static final String Q1_FIELD_NAME = "q1";
    public static final String Q2_FIELD_NAME = "q2";
    public static final String V1_FIELD_NAME = "v1";
    public static final String V2_FIELD_NAME = "v2";
    public static final String G1_FIELD_NAME = "g1";
    public static final String G2_FIELD_NAME = "g2";
    public static final String T1_FIELD_NAME = "t1";
    public static final String T2_FIELD_NAME = "t2";
    public static final String T3_FIELD_NAME = "t3";
    public static final String TW_FIELD_NAME = "tw";
    private List<KipData> dataList = new ArrayList<KipData>();
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = IVB_FIELD_NAME)
    private String ivb;

    @DatabaseField(columnName = SYS_FIELD_NAME)
    private String sys;

    @DatabaseField(columnName = DATE_FIELD_NAME)
    private String date;

    @DatabaseField(columnName = TIME_FIELD_NAME)
    private String time;

    @DatabaseField(columnName = Q1_FIELD_NAME)
    private String q1;

    @DatabaseField(columnName = Q2_FIELD_NAME)
    private String q2;

    @DatabaseField(columnName = V1_FIELD_NAME)
    private String v1;

    @DatabaseField(columnName = V2_FIELD_NAME)
    private String v2;

    @DatabaseField(columnName = G1_FIELD_NAME)
    private String g1;

    @DatabaseField(columnName = G2_FIELD_NAME)
    private String g2;

    @DatabaseField(columnName = T1_FIELD_NAME)
    private String t1;

    @DatabaseField(columnName = T2_FIELD_NAME)
    private String t2;

    @DatabaseField(columnName = T3_FIELD_NAME)
    private String t3;

    @DatabaseField(columnName = TW_FIELD_NAME)
    private String tw;

    KipData() {

    }

    public KipData(int id, String ivb, String sys, String date, String time, String q1, String q2, String v1, String v2, String g1, String g2, String t1, String t2, String t3, String tw) {
        this.id = id;
        this.ivb = ivb;
        this.sys = sys;
        this.date = date;
        this.time = time;
        this.q1 = q1;
        this.q2 = q2;
        this.v1 = v1;
        this.v2 = v2;
        this.g1 = g1;
        this.g2 = g2;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.tw = tw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIvb() {
        return ivb;
    }

    public void setIvb(String ivb) {
        this.ivb = ivb;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public String getTw() {
        return tw;
    }

    public void setTw(String tw) {
        this.tw = tw;
    }
}
