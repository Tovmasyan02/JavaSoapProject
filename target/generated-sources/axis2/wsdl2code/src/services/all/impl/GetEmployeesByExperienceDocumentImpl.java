/*
 * An XML document type.
 * Localname: getEmployeesByExperience
 * Namespace: http://all.Services/
 * Java type: services.all.GetEmployeesByExperienceDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one getEmployeesByExperience(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class GetEmployeesByExperienceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetEmployeesByExperienceDocument
{
    
    public GetEmployeesByExperienceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEMPLOYEESBYEXPERIENCE$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "getEmployeesByExperience");
    
    
    /**
     * Gets the "getEmployeesByExperience" element
     */
    public services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience getGetEmployeesByExperience()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience target = null;
            target = (services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience)get_store().find_element_user(GETEMPLOYEESBYEXPERIENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEmployeesByExperience" element
     */
    public void setGetEmployeesByExperience(services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience getEmployeesByExperience)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience target = null;
            target = (services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience)get_store().find_element_user(GETEMPLOYEESBYEXPERIENCE$0, 0);
            if (target == null)
            {
                target = (services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience)get_store().add_element_user(GETEMPLOYEESBYEXPERIENCE$0);
            }
            target.set(getEmployeesByExperience);
        }
    }
    
    /**
     * Appends and returns a new empty "getEmployeesByExperience" element
     */
    public services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience addNewGetEmployeesByExperience()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience target = null;
            target = (services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience)get_store().add_element_user(GETEMPLOYEESBYEXPERIENCE$0);
            return target;
        }
    }
    /**
     * An XML getEmployeesByExperience(@http://all.Services/).
     *
     * This is a complex type.
     */
    public static class GetEmployeesByExperienceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience
    {
        
        public GetEmployeesByExperienceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXPERIENCE$0 = 
            new javax.xml.namespace.QName("", "experience");
        
        
        /**
         * Gets the "experience" element
         */
        public double getExperience()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPERIENCE$0, 0);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EXPERIENCE$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "experience" element
         */
        public boolean isNilExperience()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EXPERIENCE$0, 0);
                if (target == null) return false;
                return target.isNil();
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPERIENCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPERIENCE$0);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EXPERIENCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EXPERIENCE$0);
                }
                target.set(experience);
            }
        }
        
        /**
         * Nils the "experience" element
         */
        public void setNilExperience()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EXPERIENCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EXPERIENCE$0);
                }
                target.setNil();
            }
        }
    }
}
