package com.youku.search.console.pojo;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.util.Transaction;



          

/**
 * ?��?��?��???��??????????
 *
 * This class was autogenerated by Torque on:
 *
 * [Thu Feb 19 10:34:56 CST 2009]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to EpisodeLog
 */
public abstract class BaseEpisodeLog extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1235010896562L;

    /** The Peer class */
    private static final EpisodeLogPeer peer =
        new EpisodeLogPeer();

        
    /** The value for the id field */
    private int id;
      
    /** The value for the keyword field */
    private String keyword;
      
    /** The value for the fkEpisodeId field */
    private int fkEpisodeId;
      
    /** The value for the createtime field */
    private String createtime;
                                          
    /** The value for the status field */
    private int status = 0;
  
            
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
     * Get the Keyword
     *
     * @return String
     */
    public String getKeyword()
    {
        return keyword;
    }

                        
    /**
     * Set the value of Keyword
     *
     * @param v new value
     */
    public void setKeyword(String v) 
    {
    
                  if (!ObjectUtils.equals(this.keyword, v))
              {
            this.keyword = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the FkEpisodeId
     *
     * @return int
     */
    public int getFkEpisodeId()
    {
        return fkEpisodeId;
    }

                        
    /**
     * Set the value of FkEpisodeId
     *
     * @param v new value
     */
    public void setFkEpisodeId(int v) 
    {
    
                  if (this.fkEpisodeId != v)
              {
            this.fkEpisodeId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Createtime
     *
     * @return String
     */
    public String getCreatetime()
    {
        return createtime;
    }

                        
    /**
     * Set the value of Createtime
     *
     * @param v new value
     */
    public void setCreatetime(String v) 
    {
    
                  if (!ObjectUtils.equals(this.createtime, v))
              {
            this.createtime = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Status
     *
     * @return int
     */
    public int getStatus()
    {
        return status;
    }

                        
    /**
     * Set the value of Status
     *
     * @param v new value
     */
    public void setStatus(int v) 
    {
    
                  if (this.status != v)
              {
            this.status = v;
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
              fieldNames.add("Keyword");
              fieldNames.add("FkEpisodeId");
              fieldNames.add("Createtime");
              fieldNames.add("Status");
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
          if (name.equals("Keyword"))
        {
                return getKeyword();
            }
          if (name.equals("FkEpisodeId"))
        {
                return new Integer(getFkEpisodeId());
            }
          if (name.equals("Createtime"))
        {
                return getCreatetime();
            }
          if (name.equals("Status"))
        {
                return new Integer(getStatus());
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
          if (name.equals("Keyword"))
        {
                      // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setKeyword((String) value);
                      return true;
        }
          if (name.equals("FkEpisodeId"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setFkEpisodeId(((Integer) value).intValue());
                      return true;
        }
          if (name.equals("Createtime"))
        {
                      // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setCreatetime((String) value);
                      return true;
        }
          if (name.equals("Status"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setStatus(((Integer) value).intValue());
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
          if (name.equals(EpisodeLogPeer.ID))
        {
                return new Integer(getId());
            }
          if (name.equals(EpisodeLogPeer.KEYWORD))
        {
                return getKeyword();
            }
          if (name.equals(EpisodeLogPeer.FK_EPISODE_ID))
        {
                return new Integer(getFkEpisodeId());
            }
          if (name.equals(EpisodeLogPeer.CREATETIME))
        {
                return getCreatetime();
            }
          if (name.equals(EpisodeLogPeer.STATUS))
        {
                return new Integer(getStatus());
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
        if (EpisodeLogPeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
        if (EpisodeLogPeer.KEYWORD.equals(name))
        {
            return setByName("Keyword", value);
        }
        if (EpisodeLogPeer.FK_EPISODE_ID.equals(name))
        {
            return setByName("FkEpisodeId", value);
        }
        if (EpisodeLogPeer.CREATETIME.equals(name))
        {
            return setByName("Createtime", value);
        }
        if (EpisodeLogPeer.STATUS.equals(name))
        {
            return setByName("Status", value);
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
                return getKeyword();
            }
              if (pos == 2)
        {
                return new Integer(getFkEpisodeId());
            }
              if (pos == 3)
        {
                return getCreatetime();
            }
              if (pos == 4)
        {
                return new Integer(getStatus());
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
            return setByName("Keyword", value);
        }
          if (position == 2)
        {
            return setByName("FkEpisodeId", value);
        }
          if (position == 3)
        {
            return setByName("Createtime", value);
        }
          if (position == 4)
        {
            return setByName("Status", value);
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
          save(EpisodeLogPeer.DATABASE_NAME);
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
                    EpisodeLogPeer.doInsert((EpisodeLog) this, con);
                    setNew(false);
                }
                else
                {
                    EpisodeLogPeer.doUpdate((EpisodeLog) this, con);
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
      public EpisodeLog copy() throws TorqueException
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
    public EpisodeLog copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new EpisodeLog(), deepcopy);
    }
      
      /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     * @param copyObj the object to fill.
     */
    protected EpisodeLog copyInto(EpisodeLog copyObj) throws TorqueException
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
      protected EpisodeLog copyInto(EpisodeLog copyObj, boolean deepcopy) throws TorqueException
      {
          copyObj.setId(id);
          copyObj.setKeyword(keyword);
          copyObj.setFkEpisodeId(fkEpisodeId);
          copyObj.setCreatetime(createtime);
          copyObj.setStatus(status);
  
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
    public EpisodeLogPeer getPeer()
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
        return EpisodeLogPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("EpisodeLog:\n");
        str.append("Id = ")
               .append(getId())
             .append("\n");
        str.append("Keyword = ")
               .append(getKeyword())
             .append("\n");
        str.append("FkEpisodeId = ")
               .append(getFkEpisodeId())
             .append("\n");
        str.append("Createtime = ")
               .append(getCreatetime())
             .append("\n");
        str.append("Status = ")
               .append(getStatus())
             .append("\n");
        return(str.toString());
    }
}
