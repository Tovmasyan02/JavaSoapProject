/*
 * XML Type:  employee
 * Namespace: http://all.Services/
 * Java type: services.all.Employee
 *
 * Automatically generated - do not modify.
 */
package services.all;


/**
 * An XML employee(@http://all.Services/).
 *
 * This is a complex type.
 */
public interface Employee extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Employee.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3B0750D825A0B11868E259605CBDBE11").resolveHandle("employee831btype");
    
    /**
     * Gets the "employeeId" element
     */
    int getEmployeeId();
    
    /**
     * Gets (as xml) the "employeeId" element
     */
    org.apache.xmlbeans.XmlInt xgetEmployeeId();
    
    /**
     * Sets the "employeeId" element
     */
    void setEmployeeId(int employeeId);
    
    /**
     * Sets (as xml) the "employeeId" element
     */
    void xsetEmployeeId(org.apache.xmlbeans.XmlInt employeeId);
    
    /**
     * Gets the "experience" element
     */
    double getExperience();
    
    /**
     * Gets (as xml) the "experience" element
     */
    org.apache.xmlbeans.XmlDouble xgetExperience();
    
    /**
     * Sets the "experience" element
     */
    void setExperience(double experience);
    
    /**
     * Sets (as xml) the "experience" element
     */
    void xsetExperience(org.apache.xmlbeans.XmlDouble experience);
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.all.Employee newInstance() {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.all.Employee newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.all.Employee parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.all.Employee parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.all.Employee parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.all.Employee parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.all.Employee parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.all.Employee parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.all.Employee parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.all.Employee parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.all.Employee parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.all.Employee parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.all.Employee parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.all.Employee parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.all.Employee parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.all.Employee parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.Employee parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.Employee parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
