/*
 * An XML document type.
 * Localname: getEmployeesByExperienceResponse
 * Namespace: http://all.Services/
 * Java type: services.all.GetEmployeesByExperienceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one getEmployeesByExperienceResponse(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class GetEmployeesByExperienceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetEmployeesByExperienceResponseDocument
{
    
    public GetEmployeesByExperienceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEMPLOYEESBYEXPERIENCERESPONSE$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "getEmployeesByExperienceResponse");
    
    
    /**
     * Gets the "getEmployeesByExperienceResponse" element
     */
    public services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse getGetEmployeesByExperienceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse target = null;
            target = (services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse)get_store().find_element_user(GETEMPLOYEESBYEXPERIENCERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEmployeesByExperienceResponse" element
     */
    public void setGetEmployeesByExperienceResponse(services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse getEmployeesByExperienceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse target = null;
            target = (services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse)get_store().find_element_user(GETEMPLOYEESBYEXPERIENCERESPONSE$0, 0);
            if (target == null)
            {
                target = (services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse)get_store().add_element_user(GETEMPLOYEESBYEXPERIENCERESPONSE$0);
            }
            target.set(getEmployeesByExperienceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getEmployeesByExperienceResponse" element
     */
    public services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse addNewGetEmployeesByExperienceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse target = null;
            target = (services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse)get_store().add_element_user(GETEMPLOYEESBYEXPERIENCERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getEmployeesByExperienceResponse(@http://all.Services/).
     *
     * This is a complex type.
     */
    public static class GetEmployeesByExperienceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse
    {
        
        public GetEmployeesByExperienceResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public services.all.Company getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Company target = null;
                target = (services.all.Company)get_store().find_element_user(RETURN$0, 0);
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
                services.all.Company target = null;
                target = (services.all.Company)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(services.all.Company xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Company target = null;
                target = (services.all.Company)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (services.all.Company)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public services.all.Company addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Company target = null;
                target = (services.all.Company)get_store().add_element_user(RETURN$0);
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
                services.all.Company target = null;
                target = (services.all.Company)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (services.all.Company)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
