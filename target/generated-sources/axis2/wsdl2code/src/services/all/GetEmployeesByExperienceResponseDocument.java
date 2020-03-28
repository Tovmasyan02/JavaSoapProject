/*
 * An XML document type.
 * Localname: getEmployeesByExperienceResponse
 * Namespace: http://all.Services/
 * Java type: services.all.GetEmployeesByExperienceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package services.all;


/**
 * A document containing one getEmployeesByExperienceResponse(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public interface GetEmployeesByExperienceResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEmployeesByExperienceResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96F4B5C626DEC24A81840275802AF6CE").resolveHandle("getemployeesbyexperienceresponse38a8doctype");
    
    /**
     * Gets the "getEmployeesByExperienceResponse" element
     */
    services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse getGetEmployeesByExperienceResponse();
    
    /**
     * Sets the "getEmployeesByExperienceResponse" element
     */
    void setGetEmployeesByExperienceResponse(services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse getEmployeesByExperienceResponse);
    
    /**
     * Appends and returns a new empty "getEmployeesByExperienceResponse" element
     */
    services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse addNewGetEmployeesByExperienceResponse();
    
    /**
     * An XML getEmployeesByExperienceResponse(@http://all.Services/).
     *
     * This is a complex type.
     */
    public interface GetEmployeesByExperienceResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEmployeesByExperienceResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96F4B5C626DEC24A81840275802AF6CE").resolveHandle("getemployeesbyexperienceresponseb635elemtype");
        
        /**
         * Gets the "return" element
         */
        services.all.Company getReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(services.all.Company xreturn);
        
        /**
         * Appends and returns a new empty "return" element
         */
        services.all.Company addNewReturn();
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse newInstance() {
              return (services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.all.GetEmployeesByExperienceResponseDocument newInstance() {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.all.GetEmployeesByExperienceResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.GetEmployeesByExperienceResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.GetEmployeesByExperienceResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.GetEmployeesByExperienceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
