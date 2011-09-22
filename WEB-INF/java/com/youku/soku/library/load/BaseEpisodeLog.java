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
 * 剧集播放链接操作日志
 *
 * This class was autogenerated by Torque on:
 *
 * [Thu Jun 09 15:34:24 CST 2011]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to EpisodeLog
 */
public abstract class BaseEpisodeLog extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1307604864164L;

    /** The Peer class */
    private static final EpisodeLogPeer peer =
        new EpisodeLogPeer();


    /** The value for the id field */
    private int id;

    /** The value for the type field */
    private int type;

    /** The value for the cate field */
    private int cate;

    /** The value for the status field */
    private int status = 0;

    /** The value for the fkProgrammeSiteId field */
    private int fkProgrammeSiteId;

    /** The value for the title field */
    private String title;

    /** The value for the orderId field */
    private int orderId;

    /** The value for the orderStage field */
    private int orderStage;

    /** The value for the logo field */
    private String logo;

    /** The value for the seconds field */
    private double seconds;

    /** The value for the hd field */
    private int hd = 0;

    /** The value for the url field */
    private String url;

    /** The value for the operator field */
    private String operator;

    /** The value for the updateTime field */
    private Date updateTime;

    /** The value for the createTime field */
    private Date createTime;

    /** The value for the source field */
    private String source = "000";


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
     * Get the Type
     *
     * @return int
     */
    public int getType()
    {
        return type;
    }


    /**
     * Set the value of Type
     *
     * @param v new value
     */
    public void setType(int v) 
    {

        if (this.type != v)
        {
            this.type = v;
            setModified(true);
        }


    }

    /**
     * Get the Cate
     *
     * @return int
     */
    public int getCate()
    {
        return cate;
    }


    /**
     * Set the value of Cate
     *
     * @param v new value
     */
    public void setCate(int v) 
    {

        if (this.cate != v)
        {
            this.cate = v;
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

    /**
     * Get the FkProgrammeSiteId
     *
     * @return int
     */
    public int getFkProgrammeSiteId()
    {
        return fkProgrammeSiteId;
    }


    /**
     * Set the value of FkProgrammeSiteId
     *
     * @param v new value
     */
    public void setFkProgrammeSiteId(int v) 
    {

        if (this.fkProgrammeSiteId != v)
        {
            this.fkProgrammeSiteId = v;
            setModified(true);
        }


    }

    /**
     * Get the Title
     *
     * @return String
     */
    public String getTitle()
    {
        return title;
    }


    /**
     * Set the value of Title
     *
     * @param v new value
     */
    public void setTitle(String v) 
    {

        if (!ObjectUtils.equals(this.title, v))
        {
            this.title = v;
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
     * Get the OrderStage
     *
     * @return int
     */
    public int getOrderStage()
    {
        return orderStage;
    }


    /**
     * Set the value of OrderStage
     *
     * @param v new value
     */
    public void setOrderStage(int v) 
    {

        if (this.orderStage != v)
        {
            this.orderStage = v;
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
     * Get the Hd
     *
     * @return int
     */
    public int getHd()
    {
        return hd;
    }


    /**
     * Set the value of Hd
     *
     * @param v new value
     */
    public void setHd(int v) 
    {

        if (this.hd != v)
        {
            this.hd = v;
            setModified(true);
        }


    }

    /**
     * Get the Url
     *
     * @return String
     */
    public String getUrl()
    {
        return url;
    }


    /**
     * Set the value of Url
     *
     * @param v new value
     */
    public void setUrl(String v) 
    {

        if (!ObjectUtils.equals(this.url, v))
        {
            this.url = v;
            setModified(true);
        }


    }

    /**
     * Get the Operator
     *
     * @return String
     */
    public String getOperator()
    {
        return operator;
    }


    /**
     * Set the value of Operator
     *
     * @param v new value
     */
    public void setOperator(String v) 
    {

        if (!ObjectUtils.equals(this.operator, v))
        {
            this.operator = v;
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

    /**
     * Get the CreateTime
     *
     * @return Date
     */
    public Date getCreateTime()
    {
        return createTime;
    }


    /**
     * Set the value of CreateTime
     *
     * @param v new value
     */
    public void setCreateTime(Date v) 
    {

        if (!ObjectUtils.equals(this.createTime, v))
        {
            this.createTime = v;
            setModified(true);
        }


    }

    /**
     * Get the Source
     *
     * @return String
     */
    public String getSource()
    {
        return source;
    }


    /**
     * Set the value of Source
     *
     * @param v new value
     */
    public void setSource(String v) 
    {

        if (!ObjectUtils.equals(this.source, v))
        {
            this.source = v;
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
            fieldNames.add("Type");
            fieldNames.add("Cate");
            fieldNames.add("Status");
            fieldNames.add("FkProgrammeSiteId");
            fieldNames.add("Title");
            fieldNames.add("OrderId");
            fieldNames.add("OrderStage");
            fieldNames.add("Logo");
            fieldNames.add("Seconds");
            fieldNames.add("Hd");
            fieldNames.add("Url");
            fieldNames.add("Operator");
            fieldNames.add("UpdateTime");
            fieldNames.add("CreateTime");
            fieldNames.add("Source");
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
        if (name.equals("Type"))
        {
            return new Integer(getType());
        }
        if (name.equals("Cate"))
        {
            return new Integer(getCate());
        }
        if (name.equals("Status"))
        {
            return new Integer(getStatus());
        }
        if (name.equals("FkProgrammeSiteId"))
        {
            return new Integer(getFkProgrammeSiteId());
        }
        if (name.equals("Title"))
        {
            return getTitle();
        }
        if (name.equals("OrderId"))
        {
            return new Integer(getOrderId());
        }
        if (name.equals("OrderStage"))
        {
            return new Integer(getOrderStage());
        }
        if (name.equals("Logo"))
        {
            return getLogo();
        }
        if (name.equals("Seconds"))
        {
            return new Double(getSeconds());
        }
        if (name.equals("Hd"))
        {
            return new Integer(getHd());
        }
        if (name.equals("Url"))
        {
            return getUrl();
        }
        if (name.equals("Operator"))
        {
            return getOperator();
        }
        if (name.equals("UpdateTime"))
        {
            return getUpdateTime();
        }
        if (name.equals("CreateTime"))
        {
            return getCreateTime();
        }
        if (name.equals("Source"))
        {
            return getSource();
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
        if (name.equals("Type"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setType(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Cate"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setCate(((Integer) value).intValue());
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
        if (name.equals("FkProgrammeSiteId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setFkProgrammeSiteId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Title"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setTitle((String) value);
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
        if (name.equals("OrderStage"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setOrderStage(((Integer) value).intValue());
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
        if (name.equals("Hd"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setHd(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Url"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setUrl((String) value);
            return true;
        }
        if (name.equals("Operator"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setOperator((String) value);
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
        if (name.equals("CreateTime"))
        {
            // Object fields can be null
            if (value != null && ! Date.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setCreateTime((Date) value);
            return true;
        }
        if (name.equals("Source"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setSource((String) value);
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
        if (name.equals(EpisodeLogPeer.TYPE))
        {
            return new Integer(getType());
        }
        if (name.equals(EpisodeLogPeer.CATE))
        {
            return new Integer(getCate());
        }
        if (name.equals(EpisodeLogPeer.STATUS))
        {
            return new Integer(getStatus());
        }
        if (name.equals(EpisodeLogPeer.FK_PROGRAMME_SITE_ID))
        {
            return new Integer(getFkProgrammeSiteId());
        }
        if (name.equals(EpisodeLogPeer.TITLE))
        {
            return getTitle();
        }
        if (name.equals(EpisodeLogPeer.ORDER_ID))
        {
            return new Integer(getOrderId());
        }
        if (name.equals(EpisodeLogPeer.ORDER_STAGE))
        {
            return new Integer(getOrderStage());
        }
        if (name.equals(EpisodeLogPeer.LOGO))
        {
            return getLogo();
        }
        if (name.equals(EpisodeLogPeer.SECONDS))
        {
            return new Double(getSeconds());
        }
        if (name.equals(EpisodeLogPeer.HD))
        {
            return new Integer(getHd());
        }
        if (name.equals(EpisodeLogPeer.URL))
        {
            return getUrl();
        }
        if (name.equals(EpisodeLogPeer.OPERATOR))
        {
            return getOperator();
        }
        if (name.equals(EpisodeLogPeer.UPDATE_TIME))
        {
            return getUpdateTime();
        }
        if (name.equals(EpisodeLogPeer.CREATE_TIME))
        {
            return getCreateTime();
        }
        if (name.equals(EpisodeLogPeer.SOURCE))
        {
            return getSource();
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
      if (EpisodeLogPeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
      if (EpisodeLogPeer.TYPE.equals(name))
        {
            return setByName("Type", value);
        }
      if (EpisodeLogPeer.CATE.equals(name))
        {
            return setByName("Cate", value);
        }
      if (EpisodeLogPeer.STATUS.equals(name))
        {
            return setByName("Status", value);
        }
      if (EpisodeLogPeer.FK_PROGRAMME_SITE_ID.equals(name))
        {
            return setByName("FkProgrammeSiteId", value);
        }
      if (EpisodeLogPeer.TITLE.equals(name))
        {
            return setByName("Title", value);
        }
      if (EpisodeLogPeer.ORDER_ID.equals(name))
        {
            return setByName("OrderId", value);
        }
      if (EpisodeLogPeer.ORDER_STAGE.equals(name))
        {
            return setByName("OrderStage", value);
        }
      if (EpisodeLogPeer.LOGO.equals(name))
        {
            return setByName("Logo", value);
        }
      if (EpisodeLogPeer.SECONDS.equals(name))
        {
            return setByName("Seconds", value);
        }
      if (EpisodeLogPeer.HD.equals(name))
        {
            return setByName("Hd", value);
        }
      if (EpisodeLogPeer.URL.equals(name))
        {
            return setByName("Url", value);
        }
      if (EpisodeLogPeer.OPERATOR.equals(name))
        {
            return setByName("Operator", value);
        }
      if (EpisodeLogPeer.UPDATE_TIME.equals(name))
        {
            return setByName("UpdateTime", value);
        }
      if (EpisodeLogPeer.CREATE_TIME.equals(name))
        {
            return setByName("CreateTime", value);
        }
      if (EpisodeLogPeer.SOURCE.equals(name))
        {
            return setByName("Source", value);
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
            return new Integer(getType());
        }
        if (pos == 2)
        {
            return new Integer(getCate());
        }
        if (pos == 3)
        {
            return new Integer(getStatus());
        }
        if (pos == 4)
        {
            return new Integer(getFkProgrammeSiteId());
        }
        if (pos == 5)
        {
            return getTitle();
        }
        if (pos == 6)
        {
            return new Integer(getOrderId());
        }
        if (pos == 7)
        {
            return new Integer(getOrderStage());
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
            return new Integer(getHd());
        }
        if (pos == 11)
        {
            return getUrl();
        }
        if (pos == 12)
        {
            return getOperator();
        }
        if (pos == 13)
        {
            return getUpdateTime();
        }
        if (pos == 14)
        {
            return getCreateTime();
        }
        if (pos == 15)
        {
            return getSource();
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
            return setByName("Type", value);
        }
    if (position == 2)
        {
            return setByName("Cate", value);
        }
    if (position == 3)
        {
            return setByName("Status", value);
        }
    if (position == 4)
        {
            return setByName("FkProgrammeSiteId", value);
        }
    if (position == 5)
        {
            return setByName("Title", value);
        }
    if (position == 6)
        {
            return setByName("OrderId", value);
        }
    if (position == 7)
        {
            return setByName("OrderStage", value);
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
            return setByName("Hd", value);
        }
    if (position == 11)
        {
            return setByName("Url", value);
        }
    if (position == 12)
        {
            return setByName("Operator", value);
        }
    if (position == 13)
        {
            return setByName("UpdateTime", value);
        }
    if (position == 14)
        {
            return setByName("CreateTime", value);
        }
    if (position == 15)
        {
            return setByName("Source", value);
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
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     *
     * @param con the database connection to read associated objects.
     */
    public EpisodeLog copy(Connection con) throws TorqueException
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
    public EpisodeLog copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new EpisodeLog(), deepcopy);
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
    public EpisodeLog copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new EpisodeLog(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected EpisodeLog copyInto(EpisodeLog copyObj) throws TorqueException
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
    protected EpisodeLog copyInto(EpisodeLog copyObj, Connection con) throws TorqueException
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
    protected EpisodeLog copyInto(EpisodeLog copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setType(type);
        copyObj.setCate(cate);
        copyObj.setStatus(status);
        copyObj.setFkProgrammeSiteId(fkProgrammeSiteId);
        copyObj.setTitle(title);
        copyObj.setOrderId(orderId);
        copyObj.setOrderStage(orderStage);
        copyObj.setLogo(logo);
        copyObj.setSeconds(seconds);
        copyObj.setHd(hd);
        copyObj.setUrl(url);
        copyObj.setOperator(operator);
        copyObj.setUpdateTime(updateTime);
        copyObj.setCreateTime(createTime);
        copyObj.setSource(source);

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
    protected EpisodeLog copyInto(EpisodeLog copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setType(type);
        copyObj.setCate(cate);
        copyObj.setStatus(status);
        copyObj.setFkProgrammeSiteId(fkProgrammeSiteId);
        copyObj.setTitle(title);
        copyObj.setOrderId(orderId);
        copyObj.setOrderStage(orderStage);
        copyObj.setLogo(logo);
        copyObj.setSeconds(seconds);
        copyObj.setHd(hd);
        copyObj.setUrl(url);
        copyObj.setOperator(operator);
        copyObj.setUpdateTime(updateTime);
        copyObj.setCreateTime(createTime);
        copyObj.setSource(source);

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
        str.append("Type = ")
           .append(getType())
           .append("\n");
        str.append("Cate = ")
           .append(getCate())
           .append("\n");
        str.append("Status = ")
           .append(getStatus())
           .append("\n");
        str.append("FkProgrammeSiteId = ")
           .append(getFkProgrammeSiteId())
           .append("\n");
        str.append("Title = ")
           .append(getTitle())
           .append("\n");
        str.append("OrderId = ")
           .append(getOrderId())
           .append("\n");
        str.append("OrderStage = ")
           .append(getOrderStage())
           .append("\n");
        str.append("Logo = ")
           .append(getLogo())
           .append("\n");
        str.append("Seconds = ")
           .append(getSeconds())
           .append("\n");
        str.append("Hd = ")
           .append(getHd())
           .append("\n");
        str.append("Url = ")
           .append(getUrl())
           .append("\n");
        str.append("Operator = ")
           .append(getOperator())
           .append("\n");
        str.append("UpdateTime = ")
           .append(getUpdateTime())
           .append("\n");
        str.append("CreateTime = ")
           .append(getCreateTime())
           .append("\n");
        str.append("Source = ")
           .append(getSource())
           .append("\n");
        return(str.toString());
    }
}