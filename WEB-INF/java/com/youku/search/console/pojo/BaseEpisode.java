package com.youku.search.console.pojo;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;



                        

/**
 * ????����
 *
 * This class was autogenerated by Torque on:
 *
 * [Fri Aug 07 15:09:28 CST 2009]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to Episode
 */
public abstract class BaseEpisode extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1249628968640L;

    /** The Peer class */
    private static final EpisodePeer peer =
        new EpisodePeer();

        
    /** The value for the id field */
    private int id;
      
    /** The value for the fkTeleplayId field */
    private int fkTeleplayId;
      
    /** The value for the fkVersionId field */
    private int fkVersionId;
      
    /** The value for the name field */
    private String name;
      
    /** The value for the orderId field */
    private int orderId;
      
    /** The value for the sourceName field */
    private String sourceName;
      
    /** The value for the videoId field */
    private String videoId;
      
    /** The value for the encodeVideoId field */
    private String encodeVideoId;
      
    /** The value for the logo field */
    private String logo;
      
    /** The value for the seconds field */
    private double seconds;
                                          
    /** The value for the islock field */
    private int islock = 0;
      
    /** The value for the fileId field */
    private String fileId;
  
            
    /**
     * Get the Id
     *
     * @return int
     */
    public int getId()
    {
        return id;
    }

                        
    /**
     * Set the value of Id
     *
     * @param v new value
     */
    public void setId(int v) 
    {
    
                  if (this.id != v)
              {
            this.id = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the FkTeleplayId
     *
     * @return int
     */
    public int getFkTeleplayId()
    {
        return fkTeleplayId;
    }

                        
    /**
     * Set the value of FkTeleplayId
     *
     * @param v new value
     */
    public void setFkTeleplayId(int v) 
    {
    
                  if (this.fkTeleplayId != v)
              {
            this.fkTeleplayId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the FkVersionId
     *
     * @return int
     */
    public int getFkVersionId()
    {
        return fkVersionId;
    }

                        
    /**
     * Set the value of FkVersionId
     *
     * @param v new value
     */
    public void setFkVersionId(int v) 
    {
    
                  if (this.fkVersionId != v)
              {
            this.fkVersionId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Name
     *
     * @return String
     */
    public String getName()
    {
        return name;
    }

                        
    /**
     * Set the value of Name
     *
     * @param v new value
     */
    public void setName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.name, v))
              {
            this.name = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the OrderId
     *
     * @return int
     */
    public int getOrderId()
    {
        return orderId;
    }

                        
    /**
     * Set the value of OrderId
     *
     * @param v new value
     */
    public void setOrderId(int v) 
    {
    
                  if (this.orderId != v)
              {
            this.orderId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the SourceName
     *
     * @return String
     */
    public String getSourceName()
    {
        return sourceName;
    }

                        
    /**
     * Set the value of SourceName
     *
     * @param v new value
     */
    public void setSourceName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.sourceName, v))
              {
            this.sourceName = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the VideoId
     *
     * @return String
     */
    public String getVideoId()
    {
        return videoId;
    }

                        
    /**
     * Set the value of VideoId
     *
     * @param v new value
     */
    public void setVideoId(String v) 
    {
    
                  if (!ObjectUtils.equals(this.videoId, v))
              {
            this.videoId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the EncodeVideoId
     *
     * @return String
     */
    public String getEncodeVideoId()
    {
        return encodeVideoId;
    }

                        
    /**
     * Set the value of EncodeVideoId
     *
     * @param v new value
     */
    public void setEncodeVideoId(String v) 
    {
    
                  if (!ObjectUtils.equals(this.encodeVideoId, v))
              {
            this.encodeVideoId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Logo
     *
     * @return String
     */
    public String getLogo()
    {
        return logo;
    }

                        
    /**
     * Set the value of Logo
     *
     * @param v new value
     */
    public void setLogo(String v) 
    {
    
                  if (!ObjectUtils.equals(this.logo, v))
              {
            this.logo = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Seconds
     *
     * @return double
     */
    public double getSeconds()
    {
        return seconds;
    }

                        
    /**
     * Set the value of Seconds
     *
     * @param v new value
     */
    public void setSeconds(double v) 
    {
    
                  if (this.seconds != v)
              {
            this.seconds = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Islock
     *
     * @return int
     */
    public int getIslock()
    {
        return islock;
    }

                        
    /**
     * Set the value of Islock
     *
     * @param v new value
     */
    public void setIslock(int v) 
    {
    
                  if (this.islock != v)
              {
            this.islock = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the FileId
     *
     * @return String
     */
    public String getFileId()
    {
        return fileId;
    }

                        
    /**
     * Set the value of FileId
     *
     * @param v new value
     */
    public void setFileId(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fileId, v))
              {
            this.fileId = v;
            setModified(true);
        }
    
          
              }
  
         
                
    private static List<String> fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List<String> getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList<String>();
              fieldNames.add("Id");
              fieldNames.add("FkTeleplayId");
              fieldNames.add("FkVersionId");
              fieldNames.add("Name");
              fieldNames.add("OrderId");
              fieldNames.add("SourceName");
              fieldNames.add("VideoId");
              fieldNames.add("EncodeVideoId");
              fieldNames.add("Logo");
              fieldNames.add("Seconds");
              fieldNames.add("Islock");
              fieldNames.add("FileId");
              fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by field (Java) name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
          if (name.equals("Id"))
        {
                return new Integer(getId());
            }
          if (name.equals("FkTeleplayId"))
        {
                return new Integer(getFkTeleplayId());
            }
          if (name.equals("FkVersionId"))
        {
                return new Integer(getFkVersionId());
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("OrderId"))
        {
                return new Integer(getOrderId());
            }
          if (name.equals("SourceName"))
        {
                return getSourceName();
            }
          if (name.equals("VideoId"))
        {
                return getVideoId();
            }
          if (name.equals("EncodeVideoId"))
        {
                return getEncodeVideoId();
            }
          if (name.equals("Logo"))
        {
                return getLogo();
            }
          if (name.equals("Seconds"))
        {
                return new Double(getSeconds());
            }
          if (name.equals("Islock"))
        {
                return new Integer(getIslock());
            }
          if (name.equals("FileId"))
        {
                return getFileId();
            }
          return null;
    }

    /**
     * Set a field in the object by field (Java) name.
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occures with the set[Field] method.
     */
    public boolean setByName(String name, Object value )
        throws TorqueException, IllegalArgumentException
    {
          if (name.equals("Id"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setId(((Integer) value).intValue());
                      return true;
        }
          if (name.equals("FkTeleplayId"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setFkTeleplayId(((Integer) value).intValue());
                      return true;
        }
          if (name.equals("FkVersionId"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setFkVersionId(((Integer) value).intValue());
                      return true;
        }
          if (name.equals("Name"))
        {
                      // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setName((String) value);
                      return true;
        }
          if (name.equals("OrderId"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setOrderId(((Integer) value).intValue());
                      return true;
        }
          if (name.equals("SourceName"))
        {
                      // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setSourceName((String) value);
                      return true;
        }
          if (name.equals("VideoId"))
        {
                      // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setVideoId((String) value);
                      return true;
        }
          if (name.equals("EncodeVideoId"))
        {
                      // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setEncodeVideoId((String) value);
                      return true;
        }
          if (name.equals("Logo"))
        {
                      // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setLogo((String) value);
                      return true;
        }
          if (name.equals("Seconds"))
        {
                      if (value == null || ! (Double.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Double object.");
            }
            setSeconds(((Double) value).doubleValue());
                      return true;
        }
          if (name.equals("Islock"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setIslock(((Integer) value).intValue());
                      return true;
        }
          if (name.equals("FileId"))
        {
                      // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setFileId((String) value);
                      return true;
        }
          return false;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
          if (name.equals(EpisodePeer.ID))
        {
                return new Integer(getId());
            }
          if (name.equals(EpisodePeer.FK_TELEPLAY_ID))
        {
                return new Integer(getFkTeleplayId());
            }
          if (name.equals(EpisodePeer.FK_VERSION_ID))
        {
                return new Integer(getFkVersionId());
            }
          if (name.equals(EpisodePeer.NAME))
        {
                return getName();
            }
          if (name.equals(EpisodePeer.ORDER_ID))
        {
                return new Integer(getOrderId());
            }
          if (name.equals(EpisodePeer.SOURCE_NAME))
        {
                return getSourceName();
            }
          if (name.equals(EpisodePeer.VIDEO_ID))
        {
                return getVideoId();
            }
          if (name.equals(EpisodePeer.ENCODE_VIDEO_ID))
        {
                return getEncodeVideoId();
            }
          if (name.equals(EpisodePeer.LOGO))
        {
                return getLogo();
            }
          if (name.equals(EpisodePeer.SECONDS))
        {
                return new Double(getSeconds());
            }
          if (name.equals(EpisodePeer.ISLOCK))
        {
                return new Integer(getIslock());
            }
          if (name.equals(EpisodePeer.FILE_ID))
        {
                return getFileId();
            }
          return null;
    }

    /**
     * Set field values by Peer Field Name
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occures with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (EpisodePeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
        if (EpisodePeer.FK_TELEPLAY_ID.equals(name))
        {
            return setByName("FkTeleplayId", value);
        }
        if (EpisodePeer.FK_VERSION_ID.equals(name))
        {
            return setByName("FkVersionId", value);
        }
        if (EpisodePeer.NAME.equals(name))
        {
            return setByName("Name", value);
        }
        if (EpisodePeer.ORDER_ID.equals(name))
        {
            return setByName("OrderId", value);
        }
        if (EpisodePeer.SOURCE_NAME.equals(name))
        {
            return setByName("SourceName", value);
        }
        if (EpisodePeer.VIDEO_ID.equals(name))
        {
            return setByName("VideoId", value);
        }
        if (EpisodePeer.ENCODE_VIDEO_ID.equals(name))
        {
            return setByName("EncodeVideoId", value);
        }
        if (EpisodePeer.LOGO.equals(name))
        {
            return setByName("Logo", value);
        }
        if (EpisodePeer.SECONDS.equals(name))
        {
            return setByName("Seconds", value);
        }
        if (EpisodePeer.ISLOCK.equals(name))
        {
            return setByName("Islock", value);
        }
        if (EpisodePeer.FILE_ID.equals(name))
        {
            return setByName("FileId", value);
        }
          return false;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
            if (pos == 0)
        {
                return new Integer(getId());
            }
              if (pos == 1)
        {
                return new Integer(getFkTeleplayId());
            }
              if (pos == 2)
        {
                return new Integer(getFkVersionId());
            }
              if (pos == 3)
        {
                return getName();
            }
              if (pos == 4)
        {
                return new Integer(getOrderId());
            }
              if (pos == 5)
        {
                return getSourceName();
            }
              if (pos == 6)
        {
                return getVideoId();
            }
              if (pos == 7)
        {
                return getEncodeVideoId();
            }
              if (pos == 8)
        {
                return getLogo();
            }
              if (pos == 9)
        {
                return new Double(getSeconds());
            }
              if (pos == 10)
        {
                return new Integer(getIslock());
            }
              if (pos == 11)
        {
                return getFileId();
            }
              return null;
    }

    /**
     * Set field values by its position (zero based) in the XML schema.
     *
     * @param position The field position
     * @param value field value
     * @return True if value was set, false if not (invalid position / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occures with the set[Field] method.
     */
    public boolean setByPosition(int position, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (position == 0)
        {
            return setByName("Id", value);
        }
          if (position == 1)
        {
            return setByName("FkTeleplayId", value);
        }
          if (position == 2)
        {
            return setByName("FkVersionId", value);
        }
          if (position == 3)
        {
            return setByName("Name", value);
        }
          if (position == 4)
        {
            return setByName("OrderId", value);
        }
          if (position == 5)
        {
            return setByName("SourceName", value);
        }
          if (position == 6)
        {
            return setByName("VideoId", value);
        }
          if (position == 7)
        {
            return setByName("EncodeVideoId", value);
        }
          if (position == 8)
        {
            return setByName("Logo", value);
        }
          if (position == 9)
        {
            return setByName("Seconds", value);
        }
          if (position == 10)
        {
            return setByName("Islock", value);
        }
          if (position == 11)
        {
            return setByName("FileId", value);
        }
              return false;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     *
     * @throws Exception
     */
    public void save() throws Exception
    {
          save(EpisodePeer.DATABASE_NAME);
      }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
       * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
       *
     * @param dbName
     * @throws TorqueException
     */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
          try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
      }

      /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
      /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     *
     * @param con
     * @throws TorqueException
     */
    public void save(Connection con) throws TorqueException
    {
          if (!alreadyInSave)
        {
            alreadyInSave = true;


  
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    EpisodePeer.doInsert((Episode) this, con);
                    setNew(false);
                }
                else
                {
                    EpisodePeer.doUpdate((Episode) this, con);
                }
                }

                      alreadyInSave = false;
        }
      }

                  
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key id ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
            setId(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
            setId(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getId());
      }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public Episode copy() throws TorqueException
    {
            return copy(true);
        }
  
          /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     */
    public Episode copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new Episode(), deepcopy);
    }
      
      /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     * @param copyObj the object to fill.
     */
    protected Episode copyInto(Episode copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }
      
    /**
     * Fills the copyObj with the contents of this object.
       * If deepcopy is true, The associated objects are also copied 
     * and treated as new objects.
       * @param copyObj the object to fill.
       * @param deepcopy whether the associated objects should be copied.
       */
      protected Episode copyInto(Episode copyObj, boolean deepcopy) throws TorqueException
      {
          copyObj.setId(id);
          copyObj.setFkTeleplayId(fkTeleplayId);
          copyObj.setFkVersionId(fkVersionId);
          copyObj.setName(name);
          copyObj.setOrderId(orderId);
          copyObj.setSourceName(sourceName);
          copyObj.setVideoId(videoId);
          copyObj.setEncodeVideoId(encodeVideoId);
          copyObj.setLogo(logo);
          copyObj.setSeconds(seconds);
          copyObj.setIslock(islock);
          copyObj.setFileId(fileId);
  
                            copyObj.setId( 0);
                                                                              
          if (deepcopy) 
        {
            }
          return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public EpisodePeer getPeer()
    {
        return peer;
    }

    /**
     * Retrieves the TableMap object related to this Table data without
     * compiler warnings of using getPeer().getTableMap().
     *
     * @return The associated TableMap object.
     */
    public TableMap getTableMap() throws TorqueException
    {
        return EpisodePeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Episode:\n");
        str.append("Id = ")
               .append(getId())
             .append("\n");
        str.append("FkTeleplayId = ")
               .append(getFkTeleplayId())
             .append("\n");
        str.append("FkVersionId = ")
               .append(getFkVersionId())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("OrderId = ")
               .append(getOrderId())
             .append("\n");
        str.append("SourceName = ")
               .append(getSourceName())
             .append("\n");
        str.append("VideoId = ")
               .append(getVideoId())
             .append("\n");
        str.append("EncodeVideoId = ")
               .append(getEncodeVideoId())
             .append("\n");
        str.append("Logo = ")
               .append(getLogo())
             .append("\n");
        str.append("Seconds = ")
               .append(getSeconds())
             .append("\n");
        str.append("Islock = ")
               .append(getIslock())
             .append("\n");
        str.append("FileId = ")
               .append(getFileId())
             .append("\n");
        return(str.toString());
    }
}