package cn.mingyuan;

import cn.mingyuan.model.Institution;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.druid.DruidPlugin;

import java.io.File;
import java.util.List;


/**
 * Hello world!
 */
public class App {
    public static DruidPlugin createDruidPlugin(String prefix) {
        DruidPlugin druidPlugin = new DruidPlugin(PropKit.get(prefix + "jdbcUrl"), PropKit.get(prefix + "user"), PropKit.get(prefix + "password").trim());
        return druidPlugin;
    }


    public static void initJFinalORM() {
        PropKit.use(new File("conf/db.properties"));
        DruidPlugin druidPluginCommon = createDruidPlugin("common_");
        DruidPlugin druidPluginTest = createDruidPlugin("test_");

        ActiveRecordPlugin arpCommon = new ActiveRecordPlugin("common", druidPluginCommon);
        arpCommon.addMapping("institution", Institution.class);

        ActiveRecordPlugin arpTest = new ActiveRecordPlugin("test", druidPluginTest);
        arpTest.addMapping("institution", Institution.class);
        druidPluginCommon.start();
        druidPluginTest.start();
        arpCommon.start();
        arpTest.start();
    }

    public static void main(String[] args) {
        initJFinalORM();


//        new Institution().setName("Yahoo").setLeader("May").save();
//        Institution instance = Institution.dao.findById(78);
//        String name = instance.getName();
//        System.out.println(name);
//
//        Institution.dao.findById(78).setName(name + " new").update();

        Record record = Db.use("common").findById("institution", 78);

        if (record == null) {
            System.out.println("record is null");
            return;
        } else {
            System.out.println(record.getStr("name"));
            Db.use("test").update("institution", record);
        }
        List<Institution> institutions = Institution.dao.use("common").find("select id,name from institution");
        if (institutions != null) {
            System.out.println("size=" + institutions.size());
            institutions.forEach(e -> {
                System.out.println(e.getName() + "  " + e.getAddress());
            });
        }
    }
}


