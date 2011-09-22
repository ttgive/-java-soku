package com.youku.soku.manage.torque;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;





/**
 * User Table
 *
 * This class was autogenerated by Torque on:
 *
 * [Fri Aug 27 18:41:14 CST 2010]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to User
 */
public abstract class BaseUser extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1282905674218L;

    /** The Peer class */
    private static final UserPeer peer =
        new UserPeer();


    /** The value for the userId field */
    private int userId;

    /** The value for the name field */
    private String name;

    /** The value for the password field */
    private String password;

    /** The value for the actualName field */
    private String actualName;

    /** The value for the email field */
    private String email;

    /** The value for the isActive field */
    private byte isActive;

    /** The value for the isShieldSystemUser field */
    private byte isShieldSystemUser;

    /** The value for the isSuperUser field */
    private byte isSuperUser;

    /** The value for the dateJoined field */
    private Date dateJoined;

    /** The value for the lastLogin field */
    private Date lastLogin;


    /**
     * Get the UserId
     *
     * @return int
     */
    public int getUserId()
    {
        return userId;
    }


    /**
     * Set the value of UserId
     *
     * @param v new value
     */
    public void setUserId(int v) throws TorqueException
    {

        if (this.userId != v)
        {
            this.userId = v;
            setModified(true);
        }



        // update associated UserPermission
        if (collUserPermissions != null)
        {
            for (int i = 0; i < collUserPermissions.size(); i++)
            {
                ((UserPermission) collUserPermissions.get(i))
                        .setUserId(v);
            }
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
     * Get the Password
     *
     * @return String
     */
    public String getPassword()
    {
        return password;
    }


    /**
     * Set the value of Password
     *
     * @param v new value
     */
    public void setPassword(String v) 
    {

        if (!ObjectUtils.equals(this.password, v))
        {
            this.password = v;
            setModified(true);
        }


    }

    /**
     * Get the ActualName
     *
     * @return String
     */
    public String getActualName()
    {
        return actualName;
    }


    /**
     * Set the value of ActualName
     *
     * @param v new value
     */
    public void setActualName(String v) 
    {

        if (!ObjectUtils.equals(this.actualName, v))
        {
            this.actualName = v;
            setModified(true);
        }


    }

    /**
     * Get the Email
     *
     * @return String
     */
    public String getEmail()
    {
        return email;
    }


    /**
     * Set the value of Email
     *
     * @param v new value
     */
    public void setEmail(String v) 
    {

        if (!ObjectUtils.equals(this.email, v))
        {
            this.email = v;
            setModified(true);
        }


    }

    /**
     * Get the IsActive
     *
     * @return byte
     */
    public byte getIsActive()
    {
        return isActive;
    }


    /**
     * Set the value of IsActive
     *
     * @param v new value
     */
    public void setIsActive(byte v) 
    {

        if (this.isActive != v)
        {
            this.isActive = v;
            setModified(true);
        }


    }

    /**
     * Get the IsShieldSystemUser
     *
     * @return byte
     */
    public byte getIsShieldSystemUser()
    {
        return isShieldSystemUser;
    }


    /**
     * Set the value of IsShieldSystemUser
     *
     * @param v new value
     */
    public void setIsShieldSystemUser(byte v) 
    {

        if (this.isShieldSystemUser != v)
        {
            this.isShieldSystemUser = v;
            setModified(true);
        }


    }

    /**
     * Get the IsSuperUser
     *
     * @return byte
     */
    public byte getIsSuperUser()
    {
        return isSuperUser;
    }


    /**
     * Set the value of IsSuperUser
     *
     * @param v new value
     */
    public void setIsSuperUser(byte v) 
    {

        if (this.isSuperUser != v)
        {
            this.isSuperUser = v;
            setModified(true);
        }


    }

    /**
     * Get the DateJoined
     *
     * @return Date
     */
    public Date getDateJoined()
    {
        return dateJoined;
    }


    /**
     * Set the value of DateJoined
     *
     * @param v new value
     */
    public void setDateJoined(Date v) 
    {

        if (!ObjectUtils.equals(this.dateJoined, v))
        {
            this.dateJoined = v;
            setModified(true);
        }


    }

    /**
     * Get the LastLogin
     *
     * @return Date
     */
    public Date getLastLogin()
    {
        return lastLogin;
    }


    /**
     * Set the value of LastLogin
     *
     * @param v new value
     */
    public void setLastLogin(Date v) 
    {

        if (!ObjectUtils.equals(this.lastLogin, v))
        {
            this.lastLogin = v;
            setModified(true);
        }


    }

       


    /**
     * Collection to store aggregation of collUserPermissions
     */
    protected List collUserPermissions;

    /**
     * Temporary storage of collUserPermissions to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initUserPermissions()
    {
        if (collUserPermissions == null)
        {
            collUserPermissions = new ArrayList();
        }
    }


    /**
     * Method called to associate a UserPermission object to this object
     * through the UserPermission foreign key attribute
     *
     * @param l UserPermission
     * @throws TorqueException
     */
    public void addUserPermission(UserPermission l) throws TorqueException
    {
        getUserPermissions().add(l);
        l.setUser((User) this);
    }

    /**
     * The criteria used to select the current contents of collUserPermissions
     */
    private Criteria lastUserPermissionsCriteria = null;

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getUserPermissions(new Criteria())
     *
     * @return the collection of associated objects
     * @throws TorqueException
     */
    public List getUserPermissions()
        throws TorqueException
    {
        if (collUserPermissions == null)
        {
            collUserPermissions = getUserPermissions(new Criteria(10));
        }
        return collUserPermissions;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this User has previously
     * been saved, it will retrieve related UserPermissions from storage.
     * If this User is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getUserPermissions(Criteria criteria) throws TorqueException
    {
        if (collUserPermissions == null)
        {
            if (isNew())
            {
               collUserPermissions = new ArrayList();
            }
            else
            {
                criteria.add(UserPermissionPeer.USER_ID, getUserId() );
                collUserPermissions = UserPermissionPeer.doSelect(criteria);
            }
        }
        else
        {
            // criteria has no effect for a new object
            if (!isNew())
            {
                // the following code is to determine if a new query is
                // called for.  If the criteria is the same as the last
                // one, just return the collection.
                criteria.add(UserPermissionPeer.USER_ID, getUserId());
                if (!lastUserPermissionsCriteria.equals(criteria))
                {
                    collUserPermissions = UserPermissionPeer.doSelect(criteria);
                }
            }
        }
        lastUserPermissionsCriteria = criteria;

        return collUserPermissions;
    }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getUserPermissions(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUserPermissions(Connection con) throws TorqueException
    {
        if (collUserPermissions == null)
        {
            collUserPermissions = getUserPermissions(new Criteria(10), con);
        }
        return collUserPermissions;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this User has previously
     * been saved, it will retrieve related UserPermissions from storage.
     * If this User is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUserPermissions(Criteria criteria, Connection con)
            throws TorqueException
    {
        if (collUserPermissions == null)
        {
            if (isNew())
            {
               collUserPermissions = new ArrayList();
            }
            else
            {
                 criteria.add(UserPermissionPeer.USER_ID, getUserId());
                 collUserPermissions = UserPermissionPeer.doSelect(criteria, con);
             }
         }
         else
         {
             // criteria has no effect for a new object
             if (!isNew())
             {
                 // the following code is to determine if a new query is
                 // called for.  If the criteria is the same as the last
                 // one, just return the collection.
                 criteria.add(UserPermissionPeer.USER_ID, getUserId());
                 if (!lastUserPermissionsCriteria.equals(criteria))
                 {
                     collUserPermissions = UserPermissionPeer.doSelect(criteria, con);
                 }
             }
         }
         lastUserPermissionsCriteria = criteria;

         return collUserPermissions;
     }











    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this User is new, it will return
     * an empty collection; or if this User has previously
     * been saved, it will retrieve related UserPermissions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in User.
     */
    protected List getUserPermissionsJoinUser(Criteria criteria)
        throws TorqueException
    {
        if (collUserPermissions == null)
        {
            if (isNew())
            {
               collUserPermissions = new ArrayList();
            }
            else
            {
                criteria.add(UserPermissionPeer.USER_ID, getUserId());
                collUserPermissions = UserPermissionPeer.doSelectJoinUser(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            criteria.add(UserPermissionPeer.USER_ID, getUserId());
            if (!lastUserPermissionsCriteria.equals(criteria))
            {
                collUserPermissions = UserPermissionPeer.doSelectJoinUser(criteria);
            }
        }
        lastUserPermissionsCriteria = criteria;

        return collUserPermissions;
    }









    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this User is new, it will return
     * an empty collection; or if this User has previously
     * been saved, it will retrieve related UserPermissions from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in User.
     */
    protected List getUserPermissionsJoinAuthPermission(Criteria criteria)
        throws TorqueException
    {
        if (collUserPermissions == null)
        {
            if (isNew())
            {
               collUserPermissions = new ArrayList();
            }
            else
            {
                criteria.add(UserPermissionPeer.USER_ID, getUserId());
                collUserPermissions = UserPermissionPeer.doSelectJoinAuthPermission(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            criteria.add(UserPermissionPeer.USER_ID, getUserId());
            if (!lastUserPermissionsCriteria.equals(criteria))
            {
                collUserPermissions = UserPermissionPeer.doSelectJoinAuthPermission(criteria);
            }
        }
        lastUserPermissionsCriteria = criteria;

        return collUserPermissions;
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
            fieldNames.add("UserId");
            fieldNames.add("Name");
            fieldNames.add("Password");
            fieldNames.add("ActualName");
            fieldNames.add("Email");
            fieldNames.add("IsActive");
            fieldNames.add("IsShieldSystemUser");
            fieldNames.add("IsSuperUser");
            fieldNames.add("DateJoined");
            fieldNames.add("LastLogin");
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
        if (name.equals("UserId"))
        {
            return new Integer(getUserId());
        }
        if (name.equals("Name"))
        {
            return getName();
        }
        if (name.equals("Password"))
        {
            return getPassword();
        }
        if (name.equals("ActualName"))
        {
            return getActualName();
        }
        if (name.equals("Email"))
        {
            return getEmail();
        }
        if (name.equals("IsActive"))
        {
            return new Byte(getIsActive());
        }
        if (name.equals("IsShieldSystemUser"))
        {
            return new Byte(getIsShieldSystemUser());
        }
        if (name.equals("IsSuperUser"))
        {
            return new Byte(getIsSuperUser());
        }
        if (name.equals("DateJoined"))
        {
            return getDateJoined();
        }
        if (name.equals("LastLogin"))
        {
            return getLastLogin();
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
        if (name.equals("UserId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setUserId(((Integer) value).intValue());
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
        if (name.equals("Password"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setPassword((String) value);
            return true;
        }
        if (name.equals("ActualName"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setActualName((String) value);
            return true;
        }
        if (name.equals("Email"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setEmail((String) value);
            return true;
        }
        if (name.equals("IsActive"))
        {
            if (value == null || ! (Byte.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Byte object.");
            }
            setIsActive(((Byte) value).byteValue());
            return true;
        }
        if (name.equals("IsShieldSystemUser"))
        {
            if (value == null || ! (Byte.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Byte object.");
            }
            setIsShieldSystemUser(((Byte) value).byteValue());
            return true;
        }
        if (name.equals("IsSuperUser"))
        {
            if (value == null || ! (Byte.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Byte object.");
            }
            setIsSuperUser(((Byte) value).byteValue());
            return true;
        }
        if (name.equals("DateJoined"))
        {
            // Object fields can be null
            if (value != null && ! Date.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setDateJoined((Date) value);
            return true;
        }
        if (name.equals("LastLogin"))
        {
            // Object fields can be null
            if (value != null && ! Date.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setLastLogin((Date) value);
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
        if (name.equals(UserPeer.USER_ID))
        {
            return new Integer(getUserId());
        }
        if (name.equals(UserPeer.NAME))
        {
            return getName();
        }
        if (name.equals(UserPeer.PASSWORD))
        {
            return getPassword();
        }
        if (name.equals(UserPeer.ACTUAL_NAME))
        {
            return getActualName();
        }
        if (name.equals(UserPeer.EMAIL))
        {
            return getEmail();
        }
        if (name.equals(UserPeer.IS_ACTIVE))
        {
            return new Byte(getIsActive());
        }
        if (name.equals(UserPeer.IS_SHIELD_SYSTEM_USER))
        {
            return new Byte(getIsShieldSystemUser());
        }
        if (name.equals(UserPeer.IS_SUPER_USER))
        {
            return new Byte(getIsSuperUser());
        }
        if (name.equals(UserPeer.DATE_JOINED))
        {
            return getDateJoined();
        }
        if (name.equals(UserPeer.LAST_LOGIN))
        {
            return getLastLogin();
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
      if (UserPeer.USER_ID.equals(name))
        {
            return setByName("UserId", value);
        }
      if (UserPeer.NAME.equals(name))
        {
            return setByName("Name", value);
        }
      if (UserPeer.PASSWORD.equals(name))
        {
            return setByName("Password", value);
        }
      if (UserPeer.ACTUAL_NAME.equals(name))
        {
            return setByName("ActualName", value);
        }
      if (UserPeer.EMAIL.equals(name))
        {
            return setByName("Email", value);
        }
      if (UserPeer.IS_ACTIVE.equals(name))
        {
            return setByName("IsActive", value);
        }
      if (UserPeer.IS_SHIELD_SYSTEM_USER.equals(name))
        {
            return setByName("IsShieldSystemUser", value);
        }
      if (UserPeer.IS_SUPER_USER.equals(name))
        {
            return setByName("IsSuperUser", value);
        }
      if (UserPeer.DATE_JOINED.equals(name))
        {
            return setByName("DateJoined", value);
        }
      if (UserPeer.LAST_LOGIN.equals(name))
        {
            return setByName("LastLogin", value);
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
            return new Integer(getUserId());
        }
        if (pos == 1)
        {
            return getName();
        }
        if (pos == 2)
        {
            return getPassword();
        }
        if (pos == 3)
        {
            return getActualName();
        }
        if (pos == 4)
        {
            return getEmail();
        }
        if (pos == 5)
        {
            return new Byte(getIsActive());
        }
        if (pos == 6)
        {
            return new Byte(getIsShieldSystemUser());
        }
        if (pos == 7)
        {
            return new Byte(getIsSuperUser());
        }
        if (pos == 8)
        {
            return getDateJoined();
        }
        if (pos == 9)
        {
            return getLastLogin();
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
            return setByName("UserId", value);
        }
    if (position == 1)
        {
            return setByName("Name", value);
        }
    if (position == 2)
        {
            return setByName("Password", value);
        }
    if (position == 3)
        {
            return setByName("ActualName", value);
        }
    if (position == 4)
        {
            return setByName("Email", value);
        }
    if (position == 5)
        {
            return setByName("IsActive", value);
        }
    if (position == 6)
        {
            return setByName("IsShieldSystemUser", value);
        }
    if (position == 7)
        {
            return setByName("IsSuperUser", value);
        }
    if (position == 8)
        {
            return setByName("DateJoined", value);
        }
    if (position == 9)
        {
            return setByName("LastLogin", value);
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
        save(UserPeer.DATABASE_NAME);
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
                    UserPeer.doInsert((User) this, con);
                    setNew(false);
                }
                else
                {
                    UserPeer.doUpdate((User) this, con);
                }
            }


            if (collUserPermissions != null)
            {
                for (int i = 0; i < collUserPermissions.size(); i++)
                {
                    ((UserPermission) collUserPermissions.get(i)).save(con);
                }
            }
            alreadyInSave = false;
        }
    }


    /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key userId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
        setUserId(((NumberKey) key).intValue());
    }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
        setUserId(Integer.parseInt(key));
    }


    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
        return SimpleKey.keyFor(getUserId());
    }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     */
    public User copy() throws TorqueException
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
    public User copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new User(), deepcopy);
    }

    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     * @param copyObj the object to fill.
     */
    protected User copyInto(User copyObj) throws TorqueException
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
    protected User copyInto(User copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setUserId(userId);
        copyObj.setName(name);
        copyObj.setPassword(password);
        copyObj.setActualName(actualName);
        copyObj.setEmail(email);
        copyObj.setIsActive(isActive);
        copyObj.setIsShieldSystemUser(isShieldSystemUser);
        copyObj.setIsSuperUser(isSuperUser);
        copyObj.setDateJoined(dateJoined);
        copyObj.setLastLogin(lastLogin);

        copyObj.setUserId( 0);

        if (deepcopy)
        {


        List vUserPermissions = getUserPermissions();
        if (vUserPermissions != null)
        {
            for (int i = 0; i < vUserPermissions.size(); i++)
            {
                UserPermission obj = (UserPermission) vUserPermissions.get(i);
                copyObj.addUserPermission(obj.copy());
            }
        }
        else
        {
            copyObj.collUserPermissions = null;
        }
        }
        return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public UserPeer getPeer()
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
        return UserPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("User:\n");
        str.append("UserId = ")
           .append(getUserId())
           .append("\n");
        str.append("Name = ")
           .append(getName())
           .append("\n");
        str.append("Password = ")
           .append(getPassword())
           .append("\n");
        str.append("ActualName = ")
           .append(getActualName())
           .append("\n");
        str.append("Email = ")
           .append(getEmail())
           .append("\n");
        str.append("IsActive = ")
           .append(getIsActive())
           .append("\n");
        str.append("IsShieldSystemUser = ")
           .append(getIsShieldSystemUser())
           .append("\n");
        str.append("IsSuperUser = ")
           .append(getIsSuperUser())
           .append("\n");
        str.append("DateJoined = ")
           .append(getDateJoined())
           .append("\n");
        str.append("LastLogin = ")
           .append(getLastLogin())
           .append("\n");
        return(str.toString());
    }
}