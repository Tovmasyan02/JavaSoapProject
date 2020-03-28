/*
 * An XML document type.
 * Localname: list
 * Namespace: http://all.Services/
 * Java type: services.all.ListDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one list(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class ListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.ListDocument
{
    
    public ListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "list");
    
    
    /**
     * Gets the "list" element
     */
    public services.all.Company getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Company target = null;
            target = (services.all.Company)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "list" element
     */
    public void setList(services.all.Company list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Company target = null;
            target = (services.all.Company)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                target = (services.all.Company)get_store().add_element_user(LIST$0);
            }
            target.set(list);
        }
    }
    
    /**
     * Appends and returns a new empty "list" element
     */
    public services.all.Company addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Company target = null;
            target = (services.all.Company)get_store().add_element_user(LIST$0);
            return target;
        }
    }
}
