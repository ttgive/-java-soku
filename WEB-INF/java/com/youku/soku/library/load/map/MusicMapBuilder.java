package com.youku.soku.library.load.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.adapter.DB;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.InheritanceMap;

/**
 * MUSIC表
 *
  *  This class was autogenerated by Torque on:
  *
  * [Sat Apr 23 11:09:17 CST 2011]
  *
  */
public class MusicMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "com.youku.soku.library.load.map.MusicMapBuilder";

    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public synchronized void doBuild() throws TorqueException
    {
        if ( isBuilt() ) {
            return;
        }
        dbMap = Torque.getDatabaseMap("soku_library");

        dbMap.addTable("music");
        TableMap tMap = dbMap.getTable("music");
        tMap.setJavaName("Music");
        tMap.setOMClass( com.youku.soku.library.load.Music.class );
        tMap.setPeerClass( com.youku.soku.library.load.MusicPeer.class );
        tMap.setDescription("MUSIC表");
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        DB dbAdapter = Torque.getDB("soku_library");
        if (dbAdapter.getIDMethodType().equals(DB.SEQUENCE))
        {
            tMap.setPrimaryKeyMethodInfo("music_SEQ");
        }
        else if (dbAdapter.getIDMethodType().equals(DB.AUTO_INCREMENT))
        {
            tMap.setPrimaryKeyMethodInfo("music");
        }

        ColumnMap cMap = null;


  // ------------- Column: id --------------------
        cMap = new ColumnMap( "id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(true);
        cMap.setNotNull(true);
        cMap.setJavaName( "Id" );
        cMap.setAutoIncrement(true);
        cMap.setProtected(false);
        cMap.setDescription("主键id，自增");
        cMap.setInheritance("false");
        cMap.setSize( 20 );
        cMap.setPosition(1);
        tMap.addColumn(cMap);
  // ------------- Column: content_id --------------------
        cMap = new ColumnMap( "content_id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "ContentId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("id,来源于内容");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
        cMap.setPosition(2);
        tMap.addColumn(cMap);
  // ------------- Column: name --------------------
        cMap = new ColumnMap( "name", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Name" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("名称");
        cMap.setInheritance("false");
        cMap.setSize( 100 );
        cMap.setPosition(3);
        tMap.addColumn(cMap);
  // ------------- Column: logo --------------------
        cMap = new ColumnMap( "logo", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Logo" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("视频截图");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(4);
        tMap.addColumn(cMap);
  // ------------- Column: cates --------------------
        cMap = new ColumnMap( "cates", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Cates" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("分类(动作，犯罪等,多个用竖¿隔开)");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(5);
        tMap.addColumn(cMap);
  // ------------- Column: types --------------------
        cMap = new ColumnMap( "types", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Types" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("分类(音乐MTV 电影原声等,多个用竖线隔开)");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(6);
        tMap.addColumn(cMap);
  // ------------- Column: area --------------------
        cMap = new ColumnMap( "area", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Area" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("地:");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(7);
        tMap.addColumn(cMap);
  // ------------- Column: language --------------------
        cMap = new ColumnMap( "language", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Language" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("语种");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(8);
        tMap.addColumn(cMap);
  // ------------- Column: release_time --------------------
        cMap = new ColumnMap( "release_time", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "ReleaseTime" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("上映时间");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(9);
        tMap.addColumn(cMap);
  // ------------- Column: release_year --------------------
        cMap = new ColumnMap( "release_year", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "ReleaseYear" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("出品年");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
        cMap.setPosition(10);
        tMap.addColumn(cMap);
  // ------------- Column: firstletter --------------------
        cMap = new ColumnMap( "firstletter", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Firstletter" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("首字母");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(11);
        tMap.addColumn(cMap);
  // ------------- Column: brief --------------------
        cMap = new ColumnMap( "brief", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "LONGVARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Brief" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("简介");
        cMap.setInheritance("false");
        cMap.setPosition(12);
        tMap.addColumn(cMap);
  // ------------- Column: copyright_status --------------------
        cMap = new ColumnMap( "copyright_status", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "CopyrightStatus" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("版权状态:unknow authorized unauthorized expired public");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(13);
        tMap.addColumn(cMap);
  // ------------- Column: paid --------------------
        cMap = new ColumnMap( "paid", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Paid" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("是否youku付费节目,1为付费");
        cMap.setDefault("0");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(14);
        tMap.addColumn(cMap);
  // ------------- Column: seconds --------------------
        cMap = new ColumnMap( "seconds", tMap);
        cMap.setType( new Double(0) );
        cMap.setTorqueType( "FLOAT" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Seconds" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("时长");
        cMap.setInheritance("false");
        cMap.setPosition(15);
        tMap.addColumn(cMap);
  // ------------- Column: blocked --------------------
        cMap = new ColumnMap( "blocked", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Blocked" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("是否被屏蔽,1为屏蔽");
        cMap.setDefault("0");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(16);
        tMap.addColumn(cMap);
  // ------------- Column: order_id --------------------
        cMap = new ColumnMap( "order_id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "OrderId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("排序");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
        cMap.setPosition(17);
        tMap.addColumn(cMap);
  // ------------- Column: view_url --------------------
        cMap = new ColumnMap( "view_url", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "ViewUrl" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("默认观看url");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(18);
        tMap.addColumn(cMap);
  // ------------- Column: detail_url --------------------
        cMap = new ColumnMap( "detail_url", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "DetailUrl" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("默认详情url");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(19);
        tMap.addColumn(cMap);
  // ------------- Column: source --------------------
        cMap = new ColumnMap( "source", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Source" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("信息来源");
        cMap.setDefault("0");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(20);
        tMap.addColumn(cMap);
  // ------------- Column: searchkeys --------------------
        cMap = new ColumnMap( "searchkeys", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Searchkeys" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("搜索关键词");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(21);
        tMap.addColumn(cMap);
  // ------------- Column: haibao --------------------
        cMap = new ColumnMap( "haibao", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Haibao" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("海报");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(22);
        tMap.addColumn(cMap);
  // ------------- Column: flag --------------------
        cMap = new ColumnMap( "flag", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Flag" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("是否参与排行榜");
        cMap.setDefault("0");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(23);
        tMap.addColumn(cMap);
  // ------------- Column: update_time --------------------
        cMap = new ColumnMap( "update_time", tMap);
        cMap.setType( new Date() );
        cMap.setTorqueType( "TIMESTAMP" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "UpdateTime" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("更新时间");
        cMap.setInheritance("false");
        cMap.setPosition(24);
        tMap.addColumn(cMap);
  // ------------- Column: create_time --------------------
        cMap = new ColumnMap( "create_time", tMap);
        cMap.setType( new Date() );
        cMap.setTorqueType( "TIMESTAMP" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "CreateTime" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("创建时间");
        cMap.setInheritance("false");
        cMap.setPosition(25);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}