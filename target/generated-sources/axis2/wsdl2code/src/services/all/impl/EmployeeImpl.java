/*
 * XML Type:  employee
 * Namespace: http://all.Services/
 * Java type: services.all.Employee
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * An XML employee(@http://all.Services/).
 *
 * This is a complex type.
 */
public class EmployeeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.Employee
{
    
    public EmployeeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYEEID$0 = 
        new javax.xml.namespace.QName("", "employeeId");
    private static final javax.xml.namespace.QName EXPERIENCE$2 = 
        new javax.xml.namespace.QName("", "experience");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "employeeId" element
     */
    public int getEmployeeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "employeeId" element
     */
    public org.apache.xmlbeans.XmlInt xgetEmployeeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMPLOYEEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "employeeId" element
     */
    public void setEmployeeId(int employeeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYEEID$0);
            }
            target.setIntValue(employeeId);
        }
    }
    
    /**
     * Sets (as xml) the "employeeId" element
     */
    public void xsetEmployeeId(org.apache.xmlbeans.XmlInt employeeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMPLOYEEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EMPLOYEEID$0);
            }
            target.set(employeeId);
        }
    }
    
    /**
     * Gets the "experience" element
     */
    public double getExperience()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPERIENCE$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "experience" element
     */
    public org.apache.xmlbeans.XmlDouble xgetExperience()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EXPERIENCE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "experience" element
     */
    public void setExperience(double experience)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPERIENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPERIENCE$2);
            }
            target.setDoubleValue(experience);
        }
    }
    
    /**
     * Sets (as xml) the "experience" element
     */
    public void xsetExperience(org.apache.xmlbeans.XmlDouble experience)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EXPERIENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EXPERIENCE$2);
            }
            target.set(experience);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
}
