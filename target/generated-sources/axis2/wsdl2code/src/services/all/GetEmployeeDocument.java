/*
 * An XML document type.
 * Localname: getEmployee
 * Namespace: http://all.Services/
 * Java type: services.all.GetEmployeeDocument
 *
 * Automatically generated - do not modify.
 */
package services.all;


/**
 * A document containing one getEmployee(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public interface GetEmployeeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEmployeeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96F4B5C626DEC24A81840275802AF6CE").resolveHandle("getemployeeb5a7doctype");
    
    /**
     * Gets the "getEmployee" element
     */
    services.all.GetEmployeeDocument.GetEmployee getGetEmployee();
    
    /**
     * Sets the "getEmployee" element
     */
    void setGetEmployee(services.all.GetEmployeeDocument.GetEmployee getEmployee);
    
    /**
     * Appends and returns a new empty "getEmployee" element
     */
    services.all.GetEmployeeDocument.GetEmployee addNewGetEmployee();
    
    /**
     * An XML getEmployee(@http://all.Services/).
     *
     * This is a complex type.
     */
    public interface GetEmployee extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEmployee.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96F4B5C626DEC24A81840275802AF6CE").resolveHandle("getemployee9f17elemtype");
        
        /**
         * Gets the "employeeId" element
         */
        int getEmployeeId();
        
        /**
         * Gets (as xml) the "employeeId" element
         */
        org.apache.xmlbeans.XmlInt xgetEmployeeId();
        
        /**
         * Tests for nil "employeeId" element
         */
        boolean isNilEmployeeId();
        
        /**
         * Sets the "employeeId" element
         */
        void setEmployeeId(int employeeId);
        
        /**
         * Sets (as xml) the "employeeId" element
         */
        void xsetEmployeeId(org.apache.xmlbeans.XmlInt employeeId);
        
        /**
         * Nils the "employeeId" element
         */
        void setNilEmployeeId();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static services.all.GetEmployeeDocument.GetEmployee newInstance() {
              return (services.all.GetEmployeeDocument.GetEmployee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static services.all.GetEmployeeDocument.GetEmployee newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (services.all.GetEmployeeDocument.GetEmployee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.all.GetEmployeeDocument newInstance() {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.all.GetEmployeeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.all.GetEmployeeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.all.GetEmployeeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.all.GetEmployeeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.all.GetEmployeeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.all.GetEmployeeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.all.GetEmployeeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.all.GetEmployeeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.all.GetEmployeeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.all.GetEmployeeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.all.GetEmployeeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.all.GetEmployeeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.all.GetEmployeeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.all.GetEmployeeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.all.GetEmployeeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.GetEmployeeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.GetEmployeeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.GetEmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
