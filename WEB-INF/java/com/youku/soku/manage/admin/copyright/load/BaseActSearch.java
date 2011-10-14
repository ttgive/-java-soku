package com.youku.soku.manage.admin.copyright.load;


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
 * ��Ŀ�������
 *
 * This class was autogenerated by Torque on:
 *
 * [Wed Sep 28 18:26:23 CST 2011]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to ActSearch
 */
public abstract class BaseActSearch extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1317205583390L;

    /** The Peer class */
    private static final ActSearchPeer peer =
        new ActSearchPeer();


    /** The value for the id field */
    private String id = "";

    /** The value for the actId field */
    private int actId;

    /** The value for the keyword field */
    private String keyword;

    /** The value for the searchResultUrl field */
    private String searchResultUrl;

    /** The value for the searchResultSite field */
    private String searchResultSite;

    /** The value for the videoTime field */
    private int videoTime;

    /** The value for the videoPic field */
    private String videoPic;

    /** The value for the videoTitle field */
    private String videoTitle;

    /** The value for the firstCollectTime field */
    private Date firstCollectTime;

    /** The value for the lastCollectTime field */
    private Date lastCollectTime;

    /** The value for the isError field */
    private boolean isError;

    /** The value for the isDelete field */
    private boolean isDelete;


    /**
     * Get the Id
     *
     * @return String
     */
    public String getId()
    {
        return id;
    }


    /**
     * Set the value of Id
     *
     * @param v new value
     */
    public void setId(String v) 
    {

        if (!ObjectUtils.equals(this.id, v))
        {
            this.id = v;
            setModified(true);
        }


    }

    /**
     * Get the ActId
     *
     * @return int
     */
    public int getActId()
    {
        return actId;
    }


    /**
     * Set the value of ActId
     *
     * @param v new value
     */
    public void setActId(int v) 
    {

        if (this.actId != v)
        {
            this.actId = v;
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
     * Get the SearchResultUrl
     *
     * @return String
     */
    public String getSearchResultUrl()
    {
        return searchResultUrl;
    }


    /**
     * Set the value of SearchResultUrl
     *
     * @param v new value
     */
    public void setSearchResultUrl(String v) 
    {

        if (!ObjectUtils.equals(this.searchResultUrl, v))
        {
            this.searchResultUrl = v;
            setModified(true);
        }


    }

    /**
     * Get the SearchResultSite
     *
     * @return String
     */
    public String getSearchResultSite()
    {
        return searchResultSite;
    }


    /**
     * Set the value of SearchResultSite
     *
     * @param v new value
     */
    public void setSearchResultSite(String v) 
    {

        if (!ObjectUtils.equals(this.searchResultSite, v))
        {
            this.searchResultSite = v;
            setModified(true);
        }


    }

    /**
     * Get the VideoTime
     *
     * @return int
     */
    public int getVideoTime()
    {
        return videoTime;
    }


    /**
     * Set the value of VideoTime
     *
     * @param v new value
     */
    public void setVideoTime(int v) 
    {

        if (this.videoTime != v)
        {
            this.videoTime = v;
            setModified(true);
        }


    }

    /**
     * Get the VideoPic
     *
     * @return String
     */
    public String getVideoPic()
    {
        return videoPic;
    }


    /**
     * Set the value of VideoPic
     *
     * @param v new value
     */
    public void setVideoPic(String v) 
    {

        if (!ObjectUtils.equals(this.videoPic, v))
        {
            this.videoPic = v;
            setModified(true);
        }


    }

    /**
     * Get the VideoTitle
     *
     * @return String
     */
    public String getVideoTitle()
    {
        return videoTitle;
    }


    /**
     * Set the value of VideoTitle
     *
     * @param v new value
     */
    public void setVideoTitle(String v) 
    {

        if (!ObjectUtils.equals(this.videoTitle, v))
        {
            this.videoTitle = v;
            setModified(true);
        }


    }

    /**
     * Get the FirstCollectTime
     *
     * @return Date
     */
    public Date getFirstCollectTime()
    {
        return firstCollectTime;
    }


    /**
     * Set the value of FirstCollectTime
     *
     * @param v new value
     */
    public void setFirstCollectTime(Date v) 
    {

        if (!ObjectUtils.equals(this.firstCollectTime, v))
        {
            this.firstCollectTime = v;
            setModified(true);
        }


    }

    /**
     * Get the LastCollectTime
     *
     * @return Date
     */
    public Date getLastCollectTime()
    {
        return lastCollectTime;
    }


    /**
     * Set the value of LastCollectTime
     *
     * @param v new value
     */
    public void setLastCollectTime(Date v) 
    {

        if (!ObjectUtils.equals(this.lastCollectTime, v))
        {
            this.lastCollectTime = v;
            setModified(true);
        }


    }

    /**
     * Get the IsError
     *
     * @return boolean
     */
    public boolean getIsError()
    {
        return isError;
    }


    /**
     * Set the value of IsError
     *
     * @param v new value
     */
    public void setIsError(boolean v) 
    {

        if (this.isError != v)
        {
            this.isError = v;
            setModified(true);
        }


    }

    /**
     * Get the IsDelete
     *
     * @return boolean
     */
    public boolean getIsDelete()
    {
        return isDelete;
    }


    /**
     * Set the value of IsDelete
     *
     * @param v new value
     */
    public void setIsDelete(boolean v) 
    {

        if (this.isDelete != v)
        {
            this.isDelete = v;
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
            fieldNames.add("ActId");
            fieldNames.add("Keyword");
            fieldNames.add("SearchResultUrl");
            fieldNames.add("SearchResultSite");
            fieldNames.add("VideoTime");
            fieldNames.add("VideoPic");
            fieldNames.add("VideoTitle");
            fieldNames.add("FirstCollectTime");
            fieldNames.add("LastCollectTime");
            fieldNames.add("IsError");
            fieldNames.add("IsDelete");
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
            return getId();
        }
        if (name.equals("ActId"))
        {
            return new Integer(getActId());
        }
        if (name.equals("Keyword"))
        {
            return getKeyword();
        }
        if (name.equals("SearchResultUrl"))
        {
            return getSearchResultUrl();
        }
        if (name.equals("SearchResultSite"))
        {
            return getSearchResultSite();
        }
        if (name.equals("VideoTime"))
        {
            return new Integer(getVideoTime());
        }
        if (name.equals("VideoPic"))
        {
            return getVideoPic();
        }
        if (name.equals("VideoTitle"))
        {
            return getVideoTitle();
        }
        if (name.equals("FirstCollectTime"))
        {
            return getFirstCollectTime();
        }
        if (name.equals("LastCollectTime"))
        {
            return getLastCollectTime();
        }
        if (name.equals("IsError"))
        {
            return new Boolean(getIsError());
        }
        if (name.equals("IsDelete"))
        {
            return new Boolean(getIsDelete());
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
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setId((String) value);
            return true;
        }
        if (name.equals("ActId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setActId(((Integer) value).intValue());
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
        if (name.equals("SearchResultUrl"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setSearchResultUrl((String) value);
            return true;
        }
        if (name.equals("SearchResultSite"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setSearchResultSite((String) value);
            return true;
        }
        if (name.equals("VideoTime"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setVideoTime(((Integer) value).intValue());
            return true;
        }
        if (name.equals("VideoPic"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setVideoPic((String) value);
            return true;
        }
        if (name.equals("VideoTitle"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setVideoTitle((String) value);
            return true;
        }
        if (name.equals("FirstCollectTime"))
        {
            // Object fields can be null
            if (value != null && ! Date.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setFirstCollectTime((Date) value);
            return true;
        }
        if (name.equals("LastCollectTime"))
        {
            // Object fields can be null
            if (value != null && ! Date.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setLastCollectTime((Date) value);
            return true;
        }
        if (name.equals("IsError"))
        {
            if (value == null || ! (Boolean.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Boolean object.");
            }
            setIsError(((Boolean)value).booleanValue());
            return true;
        }
        if (name.equals("IsDelete"))
        {
            if (value == null || ! (Boolean.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Boolean object.");
            }
            setIsDelete(((Boolean)value).booleanValue());
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
        if (name.equals(ActSearchPeer.ID))
        {
            return getId();
        }
        if (name.equals(ActSearchPeer.ACT_ID))
        {
            return new Integer(getActId());
        }
        if (name.equals(ActSearchPeer.KEYWORD))
        {
            return getKeyword();
        }
        if (name.equals(ActSearchPeer.SEARCH_RESULT_URL))
        {
            return getSearchResultUrl();
        }
        if (name.equals(ActSearchPeer.SEARCH_RESULT_SITE))
        {
            return getSearchResultSite();
        }
        if (name.equals(ActSearchPeer.VIDEO_TIME))
        {
            return new Integer(getVideoTime());
        }
        if (name.equals(ActSearchPeer.VIDEO_PIC))
        {
            return getVideoPic();
        }
        if (name.equals(ActSearchPeer.VIDEO_TITLE))
        {
            return getVideoTitle();
        }
        if (name.equals(ActSearchPeer.FIRST_COLLECT_TIME))
        {
            return getFirstCollectTime();
        }
        if (name.equals(ActSearchPeer.LAST_COLLECT_TIME))
        {
            return getLastCollectTime();
        }
        if (name.equals(ActSearchPeer.IS_ERROR))
        {
            return new Boolean(getIsError());
        }
        if (name.equals(ActSearchPeer.IS_DELETE))
        {
            return new Boolean(getIsDelete());
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
      if (ActSearchPeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
      if (ActSearchPeer.ACT_ID.equals(name))
        {
            return setByName("ActId", value);
        }
      if (ActSearchPeer.KEYWORD.equals(name))
        {
            return setByName("Keyword", value);
        }
      if (ActSearchPeer.SEARCH_RESULT_URL.equals(name))
        {
            return setByName("SearchResultUrl", value);
        }
      if (ActSearchPeer.SEARCH_RESULT_SITE.equals(name))
        {
            return setByName("SearchResultSite", value);
        }
      if (ActSearchPeer.VIDEO_TIME.equals(name))
        {
            return setByName("VideoTime", value);
        }
      if (ActSearchPeer.VIDEO_PIC.equals(name))
        {
            return setByName("VideoPic", value);
        }
      if (ActSearchPeer.VIDEO_TITLE.equals(name))
        {
            return setByName("VideoTitle", value);
        }
      if (ActSearchPeer.FIRST_COLLECT_TIME.equals(name))
        {
            return setByName("FirstCollectTime", value);
        }
      if (ActSearchPeer.LAST_COLLECT_TIME.equals(name))
        {
            return setByName("LastCollectTime", value);
        }
      if (ActSearchPeer.IS_ERROR.equals(name))
        {
            return setByName("IsError", value);
        }
      if (ActSearchPeer.IS_DELETE.equals(name))
        {
            return setByName("IsDelete", value);
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
            return getId();
        }
        if (pos == 1)
        {
            return new Integer(getActId());
        }
        if (pos == 2)
        {
            return getKeyword();
        }
        if (pos == 3)
        {
            return getSearchResultUrl();
        }
        if (pos == 4)
        {
            return getSearchResultSite();
        }
        if (pos == 5)
        {
            return new Integer(getVideoTime());
        }
        if (pos == 6)
        {
            return getVideoPic();
        }
        if (pos == 7)
        {
            return getVideoTitle();
        }
        if (pos == 8)
        {
            return getFirstCollectTime();
        }
        if (pos == 9)
        {
            return getLastCollectTime();
        }
        if (pos == 10)
        {
            return new Boolean(getIsError());
        }
        if (pos == 11)
        {
            return new Boolean(getIsDelete());
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
            return setByName("ActId", value);
        }
    if (position == 2)
        {
            return setByName("Keyword", value);
        }
    if (position == 3)
        {
            return setByName("SearchResultUrl", value);
        }
    if (position == 4)
        {
            return setByName("SearchResultSite", value);
        }
    if (position == 5)
        {
            return setByName("VideoTime", value);
        }
    if (position == 6)
        {
            return setByName("VideoPic", value);
        }
    if (position == 7)
        {
            return setByName("VideoTitle", value);
        }
    if (position == 8)
        {
            return setByName("FirstCollectTime", value);
        }
    if (position == 9)
        {
            return setByName("LastCollectTime", value);
        }
    if (position == 10)
        {
            return setByName("IsError", value);
        }
    if (position == 11)
        {
            return setByName("IsDelete", value);
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
        save(ActSearchPeer.DATABASE_NAME);
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
                    ActSearchPeer.doInsert((ActSearch) this, con);
                    setNew(false);
                }
                else
                {
                    ActSearchPeer.doUpdate((ActSearch) this, con);
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
        setId(key.toString());
    }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
        setId(key);
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
    public ActSearch copy() throws TorqueException
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
    public ActSearch copy(Connection con) throws TorqueException
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
    public ActSearch copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new ActSearch(), deepcopy);
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
    public ActSearch copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new ActSearch(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected ActSearch copyInto(ActSearch copyObj) throws TorqueException
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
    protected ActSearch copyInto(ActSearch copyObj, Connection con) throws TorqueException
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
    protected ActSearch copyInto(ActSearch copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setActId(actId);
        copyObj.setKeyword(keyword);
        copyObj.setSearchResultUrl(searchResultUrl);
        copyObj.setSearchResultSite(searchResultSite);
        copyObj.setVideoTime(videoTime);
        copyObj.setVideoPic(videoPic);
        copyObj.setVideoTitle(videoTitle);
        copyObj.setFirstCollectTime(firstCollectTime);
        copyObj.setLastCollectTime(lastCollectTime);
        copyObj.setIsError(isError);
        copyObj.setIsDelete(isDelete);

        copyObj.setId((String)null);

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
    protected ActSearch copyInto(ActSearch copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setActId(actId);
        copyObj.setKeyword(keyword);
        copyObj.setSearchResultUrl(searchResultUrl);
        copyObj.setSearchResultSite(searchResultSite);
        copyObj.setVideoTime(videoTime);
        copyObj.setVideoPic(videoPic);
        copyObj.setVideoTitle(videoTitle);
        copyObj.setFirstCollectTime(firstCollectTime);
        copyObj.setLastCollectTime(lastCollectTime);
        copyObj.setIsError(isError);
        copyObj.setIsDelete(isDelete);

        copyObj.setId((String)null);

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
    public ActSearchPeer getPeer()
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
        return ActSearchPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("ActSearch:\n");
        str.append("Id = ")
           .append(getId())
           .append("\n");
        str.append("ActId = ")
           .append(getActId())
           .append("\n");
        str.append("Keyword = ")
           .append(getKeyword())
           .append("\n");
        str.append("SearchResultUrl = ")
           .append(getSearchResultUrl())
           .append("\n");
        str.append("SearchResultSite = ")
           .append(getSearchResultSite())
           .append("\n");
        str.append("VideoTime = ")
           .append(getVideoTime())
           .append("\n");
        str.append("VideoPic = ")
           .append(getVideoPic())
           .append("\n");
        str.append("VideoTitle = ")
           .append(getVideoTitle())
           .append("\n");
        str.append("FirstCollectTime = ")
           .append(getFirstCollectTime())
           .append("\n");
        str.append("LastCollectTime = ")
           .append(getLastCollectTime())
           .append("\n");
        str.append("IsError = ")
           .append(getIsError())
           .append("\n");
        str.append("IsDelete = ")
           .append(getIsDelete())
           .append("\n");
        return(str.toString());
    }
}
