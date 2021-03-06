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
 * ????��????????��??????????����
 *
  *  This class was autogenerated by Torque on:
  *
  * [Tue Feb 10 15:25:22 CST 2009]
  *
  */
public class VarietyEpisodeVideoMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "com.youku.search.console.pojo.map.VarietyEpisodeVideoMapBuilder";

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
        dbMap = Torque.getDatabaseMap("searchteleplay");

        dbMap.addTable("variety_episode_video");
        TableMap tMap = dbMap.getTable("variety_episode_video");
        tMap.setJavaName("VarietyEpisodeVideo");
        tMap.setOMClass( com.youku.search.console.pojo.VarietyEpisodeVideo.class );
        tMap.setPeerClass( com.youku.search.console.pojo.VarietyEpisodeVideoPeer.class );
        tMap.setDescription("????��????????��??????????����");
	    tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        tMap.setPrimaryKeyMethodInfo("variety_episode_video");

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
      		cMap.setDescription("Id??��???");
        		cMap.setInheritance("false");
                cMap.setSize( 11 );
   	              cMap.setPosition(1);
          tMap.addColumn(cMap);
    // ------------- Column: fk_variety_id --------------------
        cMap = new ColumnMap( "fk_variety_id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "FkVarietyId" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("????id");
        		cMap.setInheritance("false");
                cMap.setSize( 11 );
   	              cMap.setPosition(2);
          tMap.addColumn(cMap);
    // ------------- Column: video_id --------------------
        cMap = new ColumnMap( "video_id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "VideoId" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("????id");
        		cMap.setInheritance("false");
                cMap.setSize( 11 );
   	              cMap.setPosition(3);
          tMap.addColumn(cMap);
    // ------------- Column: status_notify --------------------
        cMap = new ColumnMap( "status_notify", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "StatusNotify" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("?????��??,0?????��?? 1???????��?? 2???��???���?");
      		cMap.setDefault("0");
      		cMap.setInheritance("false");
                cMap.setSize( 4 );
   	              cMap.setPosition(4);
          tMap.addColumn(cMap);
    // ------------- Column: shield --------------------
        cMap = new ColumnMap( "shield", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "Shield" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("??��?��???��?");
      		cMap.setDefault("0");
      		cMap.setInheritance("false");
                cMap.setSize( 1 );
   	              cMap.setPosition(5);
          tMap.addColumn(cMap);
    // ------------- Column: source_name --------------------
        cMap = new ColumnMap( "source_name", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "SourceName" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("??????????");
        		cMap.setInheritance("false");
                cMap.setSize( 100 );
   	              cMap.setPosition(6);
          tMap.addColumn(cMap);
    // ------------- Column: encode_video_id --------------------
        cMap = new ColumnMap( "encode_video_id", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
  		cMap.setNotNull(true);
        cMap.setJavaName( "EncodeVideoId" );
        cMap.setAutoIncrement(false);
  		cMap.setProtected(false);
      		cMap.setDescription("????????id");
        		cMap.setInheritance("false");
                cMap.setSize( 50 );
   	              cMap.setPosition(7);
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
      		cMap.setDescription("????????");
        		cMap.setInheritance("false");
                cMap.setSize( 200 );
   	              cMap.setPosition(8);
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
      		cMap.setDescription("?��?��");
        		cMap.setInheritance("false");
                    cMap.setPosition(9);
          tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
