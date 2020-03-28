/*
 * An XML document type.
 * Localname: employee
 * Namespace: http://all.Services/
 * Java type: services.all.EmployeeDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one employee(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class EmployeeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.EmployeeDocument
{
    
    public EmployeeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYEE$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "employee");
    
    
    /**
     * Gets the "employee" element
     */
    public services.all.Employee getEmployee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Employee target = null;
            target = (services.all.Employee)get_store().find_element_user(EMPLOYEE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "employee" element
     */
    public void setEmployee(services.all.Employee employee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Employee target = null;
            target = (services.all.Employee)get_store().find_element_user(EMPLOYEE$0, 0);
            if (target == null)
            {
                target = (services.all.Employee)get_store().add_element_user(EMPLOYEE$0);
            }
            target.set(employee);
        }
    }
    
    /**
     * Appends and returns a new empty "employee" element
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
}
