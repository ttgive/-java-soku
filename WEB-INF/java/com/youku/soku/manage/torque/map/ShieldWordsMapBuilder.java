package com.youku.soku.manage.torque.map;

import java.util.Date;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.TableMap;

/**
 * �qδ�
 *
  *  This class was autogenerated by Torque on:
  *
  * [Fri Dec 17 12:02:00 CST 2010]
  *
  */
public class ShieldWordsMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "com.youku.soku.manage.torque.map.ShieldWordsMapBuilder";

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
        dbMap = Torque.getDatabaseMap("soku");

        dbMap.addTable("shield_words");
        TableMap tMap = dbMap.getTable("shield_words");
        tMap.setJavaName("ShieldWords");
        tMap.setOMClass( com.youku.soku.manage.torque.ShieldWords.class );
        tMap.setPeerClass( com.youku.soku.manage.torque.ShieldWordsPeer.class );
        tMap.setDescription("�qδ�");
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        tMap.setPrimaryKeyMethodInfo("shield_words");

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
        cMap.setDescription("���id,����");
        cMap.setInheritance("false");
        cMap.setSize( 20 );
        cMap.setPosition(1);
        tMap.addColumn(cMap);
  // ------------- Column: word --------------------
        cMap = new ColumnMap( "word", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Word" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("�qδ�");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(2);
        tMap.addColumn(cMap);
  // ------------- Column: excluding --------------------
        cMap = new ColumnMap( "excluding", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Excluding" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("�����");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(3);
        tMap.addColumn(cMap);
  // ------------- Column: type --------------------
        cMap = new ColumnMap( "type", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Type" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("�qδʷ��࣬����4Դ�����qδ�");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(4);
        tMap.addColumn(cMap);
  // ------------- Column: youku_effect --------------------
        cMap = new ColumnMap( "youku_effect", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "YoukuEffect" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("վ����Ч");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(5);
        tMap.addColumn(cMap);
  // ------------- Column: others_effect --------------------
        cMap = new ColumnMap( "others_effect", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "OthersEffect" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("վ����Ч");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(6);
        tMap.addColumn(cMap);
  // ------------- Column: hit_role --------------------
        cMap = new ColumnMap( "hit_role", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "HitRole" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("���й���");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(7);
        tMap.addColumn(cMap);
  // ------------- Column: fk_shield_category_id --------------------
        cMap = new ColumnMap( "fk_shield_category_id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "FkShieldCategoryId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("�������");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
        cMap.setPosition(8);
        tMap.addColumn(cMap);
  // ------------- Column: start_time --------------------
        cMap = new ColumnMap( "start_time", tMap);
        cMap.setType( new Date() );
        cMap.setTorqueType( "DATE" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "StartTime" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("��Чʱ��");
        cMap.setInheritance("false");
        cMap.setPosition(9);
        tMap.addColumn(cMap);
  // ------------- Column: expire_time --------------------
        cMap = new ColumnMap( "expire_time", tMap);
        cMap.setType( new Date() );
        cMap.setTorqueType( "DATE" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "ExpireTime" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("����ʱ��");
        cMap.setInheritance("false");
        cMap.setPosition(10);
        tMap.addColumn(cMap);
  // ------------- Column: remark --------------------
        cMap = new ColumnMap( "remark", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "LONGVARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Remark" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("��ע");
        cMap.setInheritance("false");
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
        cMap.setDescription("����ʱ��");
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
        cMap.setDescription("����ʱ��");
        cMap.setInheritance("false");
        cMap.setPosition(13);
        tMap.addColumn(cMap);
  // ------------- Column: modifier --------------------
        cMap = new ColumnMap( "modifier", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Modifier" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("�޸���Ա");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(14);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
 // ------------- Column: range --------------------
        cMap = new ColumnMap( "ranges", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Ranges" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("作用范围");
        cMap.setInheritance("false");
        cMap.setSize( 4 );
        cMap.setPosition(15);
        tMap.addColumn(cMap);
    }
    
}
