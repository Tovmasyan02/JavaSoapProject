/*
 * An XML document type.
 * Localname: getEmployeeResponse
 * Namespace: http://all.Services/
 * Java type: services.all.GetEmployeeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one getEmployeeResponse(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class GetEmployeeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetEmployeeResponseDocument
{
    
    public GetEmployeeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEMPLOYEERESPONSE$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "getEmployeeResponse");
    
    
    /**
     * Gets the "getEmployeeResponse" element
     */
    public services.all.GetEmployeeResponseDocument.GetEmployeeResponse getGetEmployeeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeeResponseDocument.GetEmployeeResponse target = null;
            target = (services.all.GetEmployeeResponseDocument.GetEmployeeResponse)get_store().find_element_user(GETEMPLOYEERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEmployeeResponse" element
     */
    public void setGetEmployeeResponse(services.all.GetEmployeeResponseDocument.GetEmployeeResponse getEmployeeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeeResponseDocument.GetEmployeeResponse target = null;
            target = (services.all.GetEmployeeResponseDocument.GetEmployeeResponse)get_store().find_element_user(GETEMPLOYEERESPONSE$0, 0);
            if (target == null)
            {
                target = (services.all.GetEmployeeResponseDocument.GetEmployeeResponse)get_store().add_element_user(GETEMPLOYEERESPONSE$0);
            }
            target.set(getEmployeeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getEmployeeResponse" element
     */
    public services.all.GetEmployeeResponseDocument.GetEmployeeResponse addNewGetEmployeeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeeResponseDocument.GetEmployeeResponse target = null;
            target = (services.all.GetEmployeeResponseDocument.GetEmployeeResponse)get_store().add_element_user(GETEMPLOYEERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getEmployeeResponse(@http://all.Services/).
     *
     * This is a complex type.
     */
    public static class GetEmployeeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetEmployeeResponseDocument.GetEmployeeResponse
    {
        
        public GetEmployeeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public services.all.Employee getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Employee target = null;
                target = (services.all.Employee)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Employee target = null;
                target = (services.all.Employee)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(services.all.Employee xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Employee target = null;
                target = (services.all.Employee)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (services.all.Employee)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public services.all.Employee addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Employee target = null;
                target = (services.all.Employee)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Employee target = null;
                target = (services.all.Employee)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (services.all.Employee)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
