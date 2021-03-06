package com.youku.soku.manage.questionnaire.orm;


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
 * 问题答案
 *
 * This class was autogenerated by Torque on:
 *
 * [Tue Jul 05 22:39:54 CST 2011]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to QuestionAnswer
 */
public abstract class BaseQuestionAnswer extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1309876794856L;

    /** The Peer class */
    private static final QuestionAnswerPeer peer =
        new QuestionAnswerPeer();


    /** The value for the id field */
    private int id;

    /** The value for the problem1 field */
    private String problem1;

    /** The value for the problem2 field */
    private String problem2;

    /** The value for the problem3 field */
    private String problem3;

    /** The value for the problem4 field */
    private String problem4;

    /** The value for the problem5 field */
    private String problem5;

    /** The value for the problem6 field */
    private String problem6;

    /** The value for the problem7 field */
    private String problem7;

    /** The value for the problem8 field */
    private String problem8;

    /** The value for the problem9 field */
    private String problem9;

    /** The value for the problem10 field */
    private String problem10;

    /** The value for the fkUserId field */
    private int fkUserId;


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
     * Get the Problem1
     *
     * @return String
     */
    public String getProblem1()
    {
        return problem1;
    }


    /**
     * Set the value of Problem1
     *
     * @param v new value
     */
    public void setProblem1(String v) 
    {

        if (!ObjectUtils.equals(this.problem1, v))
        {
            this.problem1 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem2
     *
     * @return String
     */
    public String getProblem2()
    {
        return problem2;
    }


    /**
     * Set the value of Problem2
     *
     * @param v new value
     */
    public void setProblem2(String v) 
    {

        if (!ObjectUtils.equals(this.problem2, v))
        {
            this.problem2 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem3
     *
     * @return String
     */
    public String getProblem3()
    {
        return problem3;
    }


    /**
     * Set the value of Problem3
     *
     * @param v new value
     */
    public void setProblem3(String v) 
    {

        if (!ObjectUtils.equals(this.problem3, v))
        {
            this.problem3 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem4
     *
     * @return String
     */
    public String getProblem4()
    {
        return problem4;
    }


    /**
     * Set the value of Problem4
     *
     * @param v new value
     */
    public void setProblem4(String v) 
    {

        if (!ObjectUtils.equals(this.problem4, v))
        {
            this.problem4 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem5
     *
     * @return String
     */
    public String getProblem5()
    {
        return problem5;
    }


    /**
     * Set the value of Problem5
     *
     * @param v new value
     */
    public void setProblem5(String v) 
    {

        if (!ObjectUtils.equals(this.problem5, v))
        {
            this.problem5 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem6
     *
     * @return String
     */
    public String getProblem6()
    {
        return problem6;
    }


    /**
     * Set the value of Problem6
     *
     * @param v new value
     */
    public void setProblem6(String v) 
    {

        if (!ObjectUtils.equals(this.problem6, v))
        {
            this.problem6 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem7
     *
     * @return String
     */
    public String getProblem7()
    {
        return problem7;
    }


    /**
     * Set the value of Problem7
     *
     * @param v new value
     */
    public void setProblem7(String v) 
    {

        if (!ObjectUtils.equals(this.problem7, v))
        {
            this.problem7 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem8
     *
     * @return String
     */
    public String getProblem8()
    {
        return problem8;
    }


    /**
     * Set the value of Problem8
     *
     * @param v new value
     */
    public void setProblem8(String v) 
    {

        if (!ObjectUtils.equals(this.problem8, v))
        {
            this.problem8 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem9
     *
     * @return String
     */
    public String getProblem9()
    {
        return problem9;
    }


    /**
     * Set the value of Problem9
     *
     * @param v new value
     */
    public void setProblem9(String v) 
    {

        if (!ObjectUtils.equals(this.problem9, v))
        {
            this.problem9 = v;
            setModified(true);
        }


    }

    /**
     * Get the Problem10
     *
     * @return String
     */
    public String getProblem10()
    {
        return problem10;
    }


    /**
     * Set the value of Problem10
     *
     * @param v new value
     */
    public void setProblem10(String v) 
    {

        if (!ObjectUtils.equals(this.problem10, v))
        {
            this.problem10 = v;
            setModified(true);
        }


    }

    /**
     * Get the FkUserId
     *
     * @return int
     */
    public int getFkUserId()
    {
        return fkUserId;
    }


    /**
     * Set the value of FkUserId
     *
     * @param v new value
     */
    public void setFkUserId(int v) 
    {

        if (this.fkUserId != v)
        {
            this.fkUserId = v;
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
            fieldNames.add("Problem1");
            fieldNames.add("Problem2");
            fieldNames.add("Problem3");
            fieldNames.add("Problem4");
            fieldNames.add("Problem5");
            fieldNames.add("Problem6");
            fieldNames.add("Problem7");
            fieldNames.add("Problem8");
            fieldNames.add("Problem9");
            fieldNames.add("Problem10");
            fieldNames.add("FkUserId");
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
        if (name.equals("Problem1"))
        {
            return getProblem1();
        }
        if (name.equals("Problem2"))
        {
            return getProblem2();
        }
        if (name.equals("Problem3"))
        {
            return getProblem3();
        }
        if (name.equals("Problem4"))
        {
            return getProblem4();
        }
        if (name.equals("Problem5"))
        {
            return getProblem5();
        }
        if (name.equals("Problem6"))
        {
            return getProblem6();
        }
        if (name.equals("Problem7"))
        {
            return getProblem7();
        }
        if (name.equals("Problem8"))
        {
            return getProblem8();
        }
        if (name.equals("Problem9"))
        {
            return getProblem9();
        }
        if (name.equals("Problem10"))
        {
            return getProblem10();
        }
        if (name.equals("FkUserId"))
        {
            return new Integer(getFkUserId());
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
        if (name.equals("Problem1"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem1((String) value);
            return true;
        }
        if (name.equals("Problem2"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem2((String) value);
            return true;
        }
        if (name.equals("Problem3"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem3((String) value);
            return true;
        }
        if (name.equals("Problem4"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem4((String) value);
            return true;
        }
        if (name.equals("Problem5"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem5((String) value);
            return true;
        }
        if (name.equals("Problem6"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem6((String) value);
            return true;
        }
        if (name.equals("Problem7"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem7((String) value);
            return true;
        }
        if (name.equals("Problem8"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem8((String) value);
            return true;
        }
        if (name.equals("Problem9"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem9((String) value);
            return true;
        }
        if (name.equals("Problem10"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setProblem10((String) value);
            return true;
        }
        if (name.equals("FkUserId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setFkUserId(((Integer) value).intValue());
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
        if (name.equals(QuestionAnswerPeer.ID))
        {
            return new Integer(getId());
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM1))
        {
            return getProblem1();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM2))
        {
            return getProblem2();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM3))
        {
            return getProblem3();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM4))
        {
            return getProblem4();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM5))
        {
            return getProblem5();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM6))
        {
            return getProblem6();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM7))
        {
            return getProblem7();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM8))
        {
            return getProblem8();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM9))
        {
            return getProblem9();
        }
        if (name.equals(QuestionAnswerPeer.PROBLEM10))
        {
            return getProblem10();
        }
        if (name.equals(QuestionAnswerPeer.FK_USER_ID))
        {
            return new Integer(getFkUserId());
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
      if (QuestionAnswerPeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
      if (QuestionAnswerPeer.PROBLEM1.equals(name))
        {
            return setByName("Problem1", value);
        }
      if (QuestionAnswerPeer.PROBLEM2.equals(name))
        {
            return setByName("Problem2", value);
        }
      if (QuestionAnswerPeer.PROBLEM3.equals(name))
        {
            return setByName("Problem3", value);
        }
      if (QuestionAnswerPeer.PROBLEM4.equals(name))
        {
            return setByName("Problem4", value);
        }
      if (QuestionAnswerPeer.PROBLEM5.equals(name))
        {
            return setByName("Problem5", value);
        }
      if (QuestionAnswerPeer.PROBLEM6.equals(name))
        {
            return setByName("Problem6", value);
        }
      if (QuestionAnswerPeer.PROBLEM7.equals(name))
        {
            return setByName("Problem7", value);
        }
      if (QuestionAnswerPeer.PROBLEM8.equals(name))
        {
            return setByName("Problem8", value);
        }
      if (QuestionAnswerPeer.PROBLEM9.equals(name))
        {
            return setByName("Problem9", value);
        }
      if (QuestionAnswerPeer.PROBLEM10.equals(name))
        {
            return setByName("Problem10", value);
        }
      if (QuestionAnswerPeer.FK_USER_ID.equals(name))
        {
            return setByName("FkUserId", value);
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
            return getProblem1();
        }
        if (pos == 2)
        {
            return getProblem2();
        }
        if (pos == 3)
        {
            return getProblem3();
        }
        if (pos == 4)
        {
            return getProblem4();
        }
        if (pos == 5)
        {
            return getProblem5();
        }
        if (pos == 6)
        {
            return getProblem6();
        }
        if (pos == 7)
        {
            return getProblem7();
        }
        if (pos == 8)
        {
            return getProblem8();
        }
        if (pos == 9)
        {
            return getProblem9();
        }
        if (pos == 10)
        {
            return getProblem10();
        }
        if (pos == 11)
        {
            return new Integer(getFkUserId());
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
            return setByName("Problem1", value);
        }
    if (position == 2)
        {
            return setByName("Problem2", value);
        }
    if (position == 3)
        {
            return setByName("Problem3", value);
        }
    if (position == 4)
        {
            return setByName("Problem4", value);
        }
    if (position == 5)
        {
            return setByName("Problem5", value);
        }
    if (position == 6)
        {
            return setByName("Problem6", value);
        }
    if (position == 7)
        {
            return setByName("Problem7", value);
        }
    if (position == 8)
        {
            return setByName("Problem8", value);
        }
    if (position == 9)
        {
            return setByName("Problem9", value);
        }
    if (position == 10)
        {
            return setByName("Problem10", value);
        }
    if (position == 11)
        {
            return setByName("FkUserId", value);
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
        save(QuestionAnswerPeer.DATABASE_NAME);
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
                    QuestionAnswerPeer.doInsert((QuestionAnswer) this, con);
                    setNew(false);
                }
                else
                {
                    QuestionAnswerPeer.doUpdate((QuestionAnswer) this, con);
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
    public QuestionAnswer copy() throws TorqueException
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
    public QuestionAnswer copy(Connection con) throws TorqueException
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
    public QuestionAnswer copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new QuestionAnswer(), deepcopy);
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
    public QuestionAnswer copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new QuestionAnswer(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected QuestionAnswer copyInto(QuestionAnswer copyObj) throws TorqueException
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
    protected QuestionAnswer copyInto(QuestionAnswer copyObj, Connection con) throws TorqueException
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
    protected QuestionAnswer copyInto(QuestionAnswer copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setProblem1(problem1);
        copyObj.setProblem2(problem2);
        copyObj.setProblem3(problem3);
        copyObj.setProblem4(problem4);
        copyObj.setProblem5(problem5);
        copyObj.setProblem6(problem6);
        copyObj.setProblem7(problem7);
        copyObj.setProblem8(problem8);
        copyObj.setProblem9(problem9);
        copyObj.setProblem10(problem10);
        copyObj.setFkUserId(fkUserId);

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
    protected QuestionAnswer copyInto(QuestionAnswer copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setProblem1(problem1);
        copyObj.setProblem2(problem2);
        copyObj.setProblem3(problem3);
        copyObj.setProblem4(problem4);
        copyObj.setProblem5(problem5);
        copyObj.setProblem6(problem6);
        copyObj.setProblem7(problem7);
        copyObj.setProblem8(problem8);
        copyObj.setProblem9(problem9);
        copyObj.setProblem10(problem10);
        copyObj.setFkUserId(fkUserId);

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
    public QuestionAnswerPeer getPeer()
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
        return QuestionAnswerPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("QuestionAnswer:\n");
        str.append("Id = ")
           .append(getId())
           .append("\n");
        str.append("Problem1 = ")
           .append(getProblem1())
           .append("\n");
        str.append("Problem2 = ")
           .append(getProblem2())
           .append("\n");
        str.append("Problem3 = ")
           .append(getProblem3())
           .append("\n");
        str.append("Problem4 = ")
           .append(getProblem4())
           .append("\n");
        str.append("Problem5 = ")
           .append(getProblem5())
           .append("\n");
        str.append("Problem6 = ")
           .append(getProblem6())
           .append("\n");
        str.append("Problem7 = ")
           .append(getProblem7())
           .append("\n");
        str.append("Problem8 = ")
           .append(getProblem8())
           .append("\n");
        str.append("Problem9 = ")
           .append(getProblem9())
           .append("\n");
        str.append("Problem10 = ")
           .append(getProblem10())
           .append("\n");
        str.append("FkUserId = ")
           .append(getFkUserId())
           .append("\n");
        return(str.toString());
    }
}
