package com.youku.soku.library.load;


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
 * 每部剧集所匹配的视频表
 *
 * This class was autogenerated by Torque on:
 *
 * [Thu Jun 09 15:44:11 CST 2011]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to EpisodeVideo
 */
public abstract class BaseEpisodeVideo extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1307605451841L;

    /** The Peer class */
    private static final EpisodeVideoPeer peer =
        new EpisodeVideoPeer();


    /** The value for the id field */
    private int id;

    /** The value for the fkProgrammeEpisodeId field */
    private int fkProgrammeEpisodeId;

    /** The value for the videoId field */
    private int videoId;

    /** The value for the statusNotify field */
    private int statusNotify = 0;

    /** The value for the shield field */
    private int shield = 0;

    /** The value for the sourceName field */
    private String sourceName;

    /** The value for the encodeVideoId field */
    private String encodeVideoId;

    /** The value for the logo field */
    private String logo;

    /** The value for the seconds field */
    private double seconds;

    /** The value for the fileId field */
    private String fileId;

    /** The value for the updateTime field */
    private Date updateTime;


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
     * Get the FkProgrammeEpisodeId
     *
     * @return int
     */
    public int getFkProgrammeEpisodeId()
    {
        return fkProgrammeEpisodeId;
    }


    /**
     * Set the value of FkProgrammeEpisodeId
     *
     * @param v new value
     */
    public void setFkProgrammeEpisodeId(int v) 
    {

        if (this.fkProgrammeEpisodeId != v)
        {
            this.fkProgrammeEpisodeId = v;
            setModified(true);
        }


    }

    /**
     * Get the VideoId
     *
     * @return int
     */
    public int getVideoId()
    {
        return videoId;
    }


    /**
     * Set the value of VideoId
     *
     * @param v new value
     */
    public void setVideoId(int v) 
    {

        if (this.videoId != v)
        {
            this.videoId = v;
            setModified(true);
        }


    }

    /**
     * Get the StatusNotify
     *
     * @return int
     */
    public int getStatusNotify()
    {
        return statusNotify;
    }


    /**
     * Set the value of StatusNotify
     *
     * @param v new value
     */
    public void setStatusNotify(int v) 
    {

        if (this.statusNotify != v)
        {
            this.statusNotify = v;
            setModified(true);
        }


    }

    /**
     * Get the Shield
     *
     * @return int
     */
    public int getShield()
    {
        return shield;
    }


    /**
     * Set the value of Shield
     *
     * @param v new value
     */
    public void setShield(int v) 
    {

        if (this.shield != v)
        {
            this.shield = v;
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

    /**
     * Get the UpdateTime
     *
     * @return Date
     */
    public Date getUpdateTime()
    {
        return updateTime;
    }


    /**
     * Set the value of UpdateTime
     *
     * @param v new value
     */
    public void setUpdateTime(Date v) 
    {

        if (!ObjectUtils.equals(this.updateTime, v))
        {
            this.updateTime = v;
            setModified(true);
        }


    }

       
        
    private static List fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList();
            fieldNames.add("Id");
            fieldNames.add("FkProgrammeEpisodeId");
            fieldNames.add("VideoId");
            fieldNames.add("StatusNotify");
            fieldNames.add("Shield");
            fieldNames.add("SourceName");
            fieldNames.add("EncodeVideoId");
            fieldNames.add("Logo");
            fieldNames.add("Seconds");
            fieldNames.add("FileId");
            fieldNames.add("UpdateTime");
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
        if (name.equals("FkProgrammeEpisodeId"))
        {
            return new Integer(getFkProgrammeEpisodeId());
        }
        if (name.equals("VideoId"))
        {
            return new Integer(getVideoId());
        }
        if (name.equals("StatusNotify"))
        {
            return new Integer(getStatusNotify());
        }
        if (name.equals("Shield"))
        {
            return new Integer(getShield());
        }
        if (name.equals("SourceName"))
        {
            return getSourceName();
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
        if (name.equals("FileId"))
        {
            return getFileId();
        }
        if (name.equals("UpdateTime"))
        {
            return getUpdateTime();
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
     * @throws TorqueException If a problem occurs with the set[Field] method.
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
        if (name.equals("FkProgrammeEpisodeId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setFkProgrammeEpisodeId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("VideoId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setVideoId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("StatusNotify"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setStatusNotify(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Shield"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setShield(((Integer) value).intValue());
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
        if (name.equals("UpdateTime"))
        {
            // Object fields can be null
            if (value != null && ! Date.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setUpdateTime((Date) value);
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
        if (name.equals(EpisodeVideoPeer.ID))
        {
            return new Integer(getId());
        }
        if (name.equals(EpisodeVideoPeer.FK_PROGRAMME_EPISODE_ID))
        {
            return new Integer(getFkProgrammeEpisodeId());
        }
        if (name.equals(EpisodeVideoPeer.VIDEO_ID))
        {
            return new Integer(getVideoId());
        }
        if (name.equals(EpisodeVideoPeer.STATUS_NOTIFY))
        {
            return new Integer(getStatusNotify());
        }
        if (name.equals(EpisodeVideoPeer.SHIELD))
        {
            return new Integer(getShield());
        }
        if (name.equals(EpisodeVideoPeer.SOURCE_NAME))
        {
            return getSourceName();
        }
        if (name.equals(EpisodeVideoPeer.ENCODE_VIDEO_ID))
        {
            return getEncodeVideoId();
        }
        if (name.equals(EpisodeVideoPeer.LOGO))
        {
            return getLogo();
        }
        if (name.equals(EpisodeVideoPeer.SECONDS))
        {
            return new Double(getSeconds());
        }
        if (name.equals(EpisodeVideoPeer.FILE_ID))
        {
            return getFileId();
        }
        if (name.equals(EpisodeVideoPeer.UPDATE_TIME))
        {
            return getUpdateTime();
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
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
      if (EpisodeVideoPeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
      if (EpisodeVideoPeer.FK_PROGRAMME_EPISODE_ID.equals(name))
        {
            return setByName("FkProgrammeEpisodeId", value);
        }
      if (EpisodeVideoPeer.VIDEO_ID.equals(name))
        {
            return setByName("VideoId", value);
        }
      if (EpisodeVideoPeer.STATUS_NOTIFY.equals(name))
        {
            return setByName("StatusNotify", value);
        }
      if (EpisodeVideoPeer.SHIELD.equals(name))
        {
            return setByName("Shield", value);
        }
      if (EpisodeVideoPeer.SOURCE_NAME.equals(name))
        {
            return setByName("SourceName", value);
        }
      if (EpisodeVideoPeer.ENCODE_VIDEO_ID.equals(name))
        {
            return setByName("EncodeVideoId", value);
        }
      if (EpisodeVideoPeer.LOGO.equals(name))
        {
            return setByName("Logo", value);
        }
      if (EpisodeVideoPeer.SECONDS.equals(name))
        {
            return setByName("Seconds", value);
        }
      if (EpisodeVideoPeer.FILE_ID.equals(name))
        {
            return setByName("FileId", value);
        }
      if (EpisodeVideoPeer.UPDATE_TIME.equals(name))
        {
            return setByName("UpdateTime", value);
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
            return new Integer(getFkProgrammeEpisodeId());
        }
        if (pos == 2)
        {
            return new Integer(getVideoId());
        }
        if (pos == 3)
        {
            return new Integer(getStatusNotify());
        }
        if (pos == 4)
        {
            return new Integer(getShield());
        }
        if (pos == 5)
        {
            return getSourceName();
        }
        if (pos == 6)
        {
            return getEncodeVideoId();
        }
        if (pos == 7)
        {
            return getLogo();
        }
        if (pos == 8)
        {
            return new Double(getSeconds());
        }
        if (pos == 9)
        {
            return getFileId();
        }
        if (pos == 10)
        {
            return getUpdateTime();
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
     * @throws TorqueException If a problem occurs with the set[Field] method.
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
            return setByName("FkProgrammeEpisodeId", value);
        }
    if (position == 2)
        {
            return setByName("VideoId", value);
        }
    if (position == 3)
        {
            return setByName("StatusNotify", value);
        }
    if (position == 4)
        {
            return setByName("Shield", value);
        }
    if (position == 5)
        {
            return setByName("SourceName", value);
        }
    if (position == 6)
        {
            return setByName("EncodeVideoId", value);
        }
    if (position == 7)
        {
            return setByName("Logo", value);
        }
    if (position == 8)
        {
            return setByName("Seconds", value);
        }
    if (position == 9)
        {
            return setByName("FileId", value);
        }
    if (position == 10)
        {
            return setByName("UpdateTime", value);
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
        save(EpisodeVideoPeer.DATABASE_NAME);
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
                    EpisodeVideoPeer.doInsert((EpisodeVideo) this, con);
                    setNew(false);
                }
                else
                {
                    EpisodeVideoPeer.doUpdate((EpisodeVideo) this, con);
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
    public EpisodeVideo copy() throws TorqueException
    {
        return copy(true);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     *
     * @param con the database connection to read associated objects.
     */
    public EpisodeVideo copy(Connection con) throws TorqueException
    {
        return copy(true, con);
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
    public EpisodeVideo copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new EpisodeVideo(), deepcopy);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     * @param con the database connection to read associated objects.
     */
    public EpisodeVideo copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new EpisodeVideo(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected EpisodeVideo copyInto(EpisodeVideo copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }

  
    /**
     * Fills the copyObj with the contents of this object using connection.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param con the database connection to read associated objects.
     */
    protected EpisodeVideo copyInto(EpisodeVideo copyObj, Connection con) throws TorqueException
    {
        return copyInto(copyObj, true, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     */
    protected EpisodeVideo copyInto(EpisodeVideo copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setFkProgrammeEpisodeId(fkProgrammeEpisodeId);
        copyObj.setVideoId(videoId);
        copyObj.setStatusNotify(statusNotify);
        copyObj.setShield(shield);
        copyObj.setSourceName(sourceName);
        copyObj.setEncodeVideoId(encodeVideoId);
        copyObj.setLogo(logo);
        copyObj.setSeconds(seconds);
        copyObj.setFileId(fileId);
        copyObj.setUpdateTime(updateTime);

        copyObj.setId( 0);

        if (deepcopy)
        {
        }
        return copyObj;
    }
        
    
    /**
     * Fills the copyObj with the contents of this object using connection.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     * @param con the database connection to read associated objects.
     */
    protected EpisodeVideo copyInto(EpisodeVideo copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setFkProgrammeEpisodeId(fkProgrammeEpisodeId);
        copyObj.setVideoId(videoId);
        copyObj.setStatusNotify(statusNotify);
        copyObj.setShield(shield);
        copyObj.setSourceName(sourceName);
        copyObj.setEncodeVideoId(encodeVideoId);
        copyObj.setLogo(logo);
        copyObj.setSeconds(seconds);
        copyObj.setFileId(fileId);
        copyObj.setUpdateTime(updateTime);

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
    public EpisodeVideoPeer getPeer()
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
        return EpisodeVideoPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("EpisodeVideo:\n");
        str.append("Id = ")
           .append(getId())
           .append("\n");
        str.append("FkProgrammeEpisodeId = ")
           .append(getFkProgrammeEpisodeId())
           .append("\n");
        str.append("VideoId = ")
           .append(getVideoId())
           .append("\n");
        str.append("StatusNotify = ")
           .append(getStatusNotify())
           .append("\n");
        str.append("Shield = ")
           .append(getShield())
           .append("\n");
        str.append("SourceName = ")
           .append(getSourceName())
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
        str.append("FileId = ")
           .append(getFileId())
           .append("\n");
        str.append("UpdateTime = ")
           .append(getUpdateTime())
           .append("\n");
        return(str.toString());
    }
}
