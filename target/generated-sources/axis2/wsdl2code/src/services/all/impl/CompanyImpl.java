/*
 * XML Type:  company
 * Namespace: http://all.Services/
 * Java type: services.all.Company
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * An XML company(@http://all.Services/).
 *
 * This is a complex type.
 */
public class CompanyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.Company
{
    
    public CompanyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYEE$0 = 
        new javax.xml.namespace.QName("", "Employee");
    
    
    /**
     * Gets array of all "Employee" elements
     */
    public services.all.Employee[] getEmployeeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMPLOYEE$0, targetList);
            services.all.Employee[] result = new services.all.Employee[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Employee" element
     */
    public services.all.Employee getEmployeeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Employee target = null;
            target = (services.all.Employee)get_store().find_element_user(EMPLOYEE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Employee" element
     */
    public int sizeOfEmployeeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPLOYEE$0);
        }
    }
    
    /**
     * Sets array of all "Employee" element
     */
    public void setEmployeeArray(services.all.Employee[] employeeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(employeeArray, EMPLOYEE$0);
        }
    }
    
    /**
     * Sets ith "Employee" element
     */
    public void setEmployeeArray(int i, services.all.Employee employee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Employee target = null;
            target = (services.all.Employee)get_store().find_element_user(EMPLOYEE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(employee);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Employee" element
     */
    public services.all.Employee insertNewEmployee(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Employee target = null;
            target = (services.all.Employee)get_store().insert_element_user(EMPLOYEE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Employee" element
     */
    public services.all.Employee addNewEmployee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Employee target = null;
            target = (services.all.Employee)get_store().add_element_user(EMPLOYEE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Employee" element
     */
    public void removeEmployee(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPLOYEE$0, i);
        }
    }
}
