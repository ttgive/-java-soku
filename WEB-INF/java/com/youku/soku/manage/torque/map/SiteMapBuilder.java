package com.youku.soku.manage.torque.map;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.TableMap;

/**
 * 站点名称表
 *
  *  This class was autogenerated by Torque on:
  *
  * [Wed Mar 10 16:13:12 CST 2010]
  *
  */
public class SiteMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "com.youku.soku.manage.torque.map.SiteMapBuilder";

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
        dbMap = Torque.getDatabaseMap("spider");

        dbMap.addTable("site");
        TableMap tMap = dbMap.getTable("site");
        tMap.setJavaName("Site");
        tMap.setOMClass( com.youku.soku.manage.torque.Site.class );
        tMap.setPeerClass( com.youku.soku.manage.torque.SitePeer.class );
        tMap.setDescription("站点名称表");
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        tMap.setPrimaryKeyMethodInfo("site");

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
        cMap.setDescription("Id，自增");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
        cMap.setPosition(1);
        tMap.addColumn(cMap);
  // ------------- Column: name --------------------
        cMap = new ColumnMap( "name", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Name" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("站点名");
        cMap.setInheritance("false");
        cMap.setSize( 100 );
        cMap.setPosition(2);
        tMap.addColumn(cMap);
  // ------------- Column: tableName --------------------
        cMap = new ColumnMap( "tableName", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Tablename" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("");
        cMap.setInheritance("false");
        cMap.setSize( 50 );
        cMap.setPosition(3);
        tMap.addColumn(cMap);
  // ------------- Column: weight --------------------
        cMap = new ColumnMap( "weight", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Weight" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("");
        cMap.setInheritance("false");
        cMap.setSize( 11 );
        cMap.setPosition(4);
        tMap.addColumn(cMap);
  // ------------- Column: status_id --------------------
        cMap = new ColumnMap( "status_id", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "StatusId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(5);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
