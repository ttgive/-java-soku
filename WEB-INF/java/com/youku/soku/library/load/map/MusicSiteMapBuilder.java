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
 * MUSIC-站点表
 *
  *  This class was autogenerated by Torque on:
  *
  * [Sat Apr 23 11:09:17 CST 2011]
  *
  */
public class MusicSiteMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "com.youku.soku.library.load.map.MusicSiteMapBuilder";

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

        dbMap.addTable("music_site");
        TableMap tMap = dbMap.getTable("music_site");
        tMap.setJavaName("MusicSite");
        tMap.setOMClass( com.youku.soku.library.load.MusicSite.class );
        tMap.setPeerClass( com.youku.soku.library.load.MusicSitePeer.class );
        tMap.setDescription("MUSIC-站点表");
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        DB dbAdapter = Torque.getDB("soku_library");
        if (dbAdapter.getIDMethodType().equals(DB.SEQUENCE))
        {
            tMap.setPrimaryKeyMethodInfo("music_site_SEQ");
        }
        else if (dbAdapter.getIDMethodType().equals(DB.AUTO_INCREMENT))
        {
            tMap.setPrimaryKeyMethodInfo("music_site");
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
  // ------------- Column: fk_music_id --------------------
        cMap = new ColumnMap( "fk_music_id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "FkMusicId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("名称id");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
        cMap.setPosition(2);
        tMap.addColumn(cMap);
  // ------------- Column: source_site --------------------
        cMap = new ColumnMap( "source_site", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "SourceSite" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("来源站点");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
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
  // ------------- Column: hd --------------------
        cMap = new ColumnMap( "hd", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Hd" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("是否高清,1为高清");
        cMap.setDefault("0");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(5);
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
        cMap.setPosition(6);
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
        cMap.setPosition(7);
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
        cMap.setPosition(8);
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
        cMap.setPosition(9);
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
        cMap.setPosition(10);
        tMap.addColumn(cMap);
  // ------------- Column: showtotal_vv --------------------
        cMap = new ColumnMap( "showtotal_vv", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "ShowtotalVv" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("节目总播放量");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
        cMap.setPosition(11);
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
        cMap.setPosition(12);
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
        cMap.setPosition(13);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
