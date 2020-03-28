/*
 * An XML document type.
 * Localname: getEmployee
 * Namespace: http://all.Services/
 * Java type: services.all.GetEmployeeDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one getEmployee(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class GetEmployeeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetEmployeeDocument
{
    
    public GetEmployeeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEMPLOYEE$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "getEmployee");
    
    
    /**
     * Gets the "getEmployee" element
     */
    public services.all.GetEmployeeDocument.GetEmployee getGetEmployee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeeDocument.GetEmployee target = null;
            target = (services.all.GetEmployeeDocument.GetEmployee)get_store().find_element_user(GETEMPLOYEE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEmployee" element
     */
    public void setGetEmployee(services.all.GetEmployeeDocument.GetEmployee getEmployee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeeDocument.GetEmployee target = null;
            target = (services.all.GetEmployeeDocument.GetEmployee)get_store().find_element_user(GETEMPLOYEE$0, 0);
            if (target == null)
            {
                target = (services.all.GetEmployeeDocument.GetEmployee)get_store().add_element_user(GETEMPLOYEE$0);
            }
            target.set(getEmployee);
        }
    }
    
    /**
     * Appends and returns a new empty "getEmployee" element
     */
    public services.all.GetEmployeeDocument.GetEmployee addNewGetEmployee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeeDocument.GetEmployee target = null;
            target = (services.all.GetEmployeeDocument.GetEmployee)get_store().add_element_user(GETEMPLOYEE$0);
            return target;
        }
    }
    /**
     * An XML getEmployee(@http://all.Services/).
     *
     * This is a complex type.
     */
    public static class GetEmployeeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetEmployeeDocument.GetEmployee
    {
        
        public GetEmployeeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMPLOYEEID$0 = 
            new javax.xml.namespace.QName("", "employeeId");
        
        
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
         * Tests for nil "employeeId" element
         */
        public boolean isNilEmployeeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMPLOYEEID$0, 0);
                if (target == null) return false;
                return target.isNil();
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
         * Nils the "employeeId" element
         */
        public void setNilEmployeeId()
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
                target.setNil();
            }
        }
    }
}
