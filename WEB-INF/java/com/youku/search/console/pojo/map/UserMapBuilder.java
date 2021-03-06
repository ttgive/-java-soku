package com.youku.search.console.pojo.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.InheritanceMap;

/**
 * ???�����
 *
  *  This class was autogenerated by Torque on:
  *
  * [Fri Jun 12 09:58:42 CST 2009]
  *
  */
public class UserMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "com.youku.search.console.pojo.map.UserMapBuilder";

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
        dbMap = Torque.getDatabaseMap("searchconsole");

        dbMap.addTable("user");
        TableMap tMap = dbMap.getTable("user");
        tMap.setJavaName("User");
        tMap.setOMClass( com.youku.search.console.pojo.User.class );
        tMap.setPeerClass( com.youku.search.console.pojo.UserPeer.class );
        tMap.setDescription("???�����");
	    tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        tMap.setPrimaryKeyMethodInfo("user");

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
      		cMap.setDescription("?��?��id??��???");
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
      		cMap.setDescription("???��??");
        		cMap.setInheritance("false");
                cMap.setSize( 100 );
   	              cMap.setPosition(2);
          tMap.addColumn(cMap);
    // ------------- Column: password --------------------
        cMap = new ColumnMap( "password", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "Password" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("????");
        		cMap.setInheritance("false");
                cMap.setSize( 50 );
   	              cMap.setPosition(3);
          tMap.addColumn(cMap);
    // ------------- Column: true_name --------------------
        cMap = new ColumnMap( "true_name", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "TrueName" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("????????");
        		cMap.setInheritance("false");
                cMap.setSize( 100 );
   	              cMap.setPosition(4);
          tMap.addColumn(cMap);
    // ------------- Column: team --------------------
        cMap = new ColumnMap( "team", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(false);
        cMap.setJavaName( "Team" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("????");
        		cMap.setInheritance("false");
                cMap.setSize( 100 );
   	              cMap.setPosition(5);
          tMap.addColumn(cMap);
    // ------------- Column: sex --------------------
        cMap = new ColumnMap( "sex", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(false);
        cMap.setJavaName( "Sex" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("??��?");
      		cMap.setDefault("1");
      		cMap.setInheritance("false");
                cMap.setSize( 4 );
   	              cMap.setPosition(6);
          tMap.addColumn(cMap);
    // ------------- Column: birth --------------------
        cMap = new ColumnMap( "birth", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(false);
        cMap.setJavaName( "Birth" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("?��??");
        		cMap.setInheritance("false");
                cMap.setSize( 30 );
   	              cMap.setPosition(7);
          tMap.addColumn(cMap);
    // ------------- Column: lastLoginDate --------------------
        cMap = new ColumnMap( "lastLoginDate", tMap);
        cMap.setType( new Date() );
        cMap.setTorqueType( "DATE" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "Lastlogindate" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("��??��?????��??");
        		cMap.setInheritance("false");
                    cMap.setPosition(8);
          tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
