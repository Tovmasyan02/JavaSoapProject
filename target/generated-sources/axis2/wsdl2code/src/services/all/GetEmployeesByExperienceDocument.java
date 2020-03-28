/*
 * An XML document type.
 * Localname: getEmployeesByExperience
 * Namespace: http://all.Services/
 * Java type: services.all.GetEmployeesByExperienceDocument
 *
 * Automatically generated - do not modify.
 */
package services.all;


/**
 * A document containing one getEmployeesByExperience(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public interface GetEmployeesByExperienceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEmployeesByExperienceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96F4B5C626DEC24A81840275802AF6CE").resolveHandle("getemployeesbyexperience8169doctype");
    
    /**
     * Gets the "getEmployeesByExperience" element
     */
    services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience getGetEmployeesByExperience();
    
    /**
     * Sets the "getEmployeesByExperience" element
     */
    void setGetEmployeesByExperience(services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience getEmployeesByExperience);
    
    /**
     * Appends and returns a new empty "getEmployeesByExperience" element
     */
    services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience addNewGetEmployeesByExperience();
    
    /**
     * An XML getEmployeesByExperience(@http://all.Services/).
     *
     * This is a complex type.
     */
    public interface GetEmployeesByExperience extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEmployeesByExperience.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96F4B5C626DEC24A81840275802AF6CE").resolveHandle("getemployeesbyexperienceb195elemtype");
        
        /**
         * Gets the "experience" element
         */
        double getExperience();
        
        /**
         * Gets (as xml) the "experience" element
         */
        org.apache.xmlbeans.XmlDouble xgetExperience();
        
        /**
         * Tests for nil "experience" element
         */
        boolean isNilExperience();
        
        /**
         * Sets the "experience" element
         */
        void setExperience(double experience);
        
        /**
         * Sets (as xml) the "experience" element
         */
        void xsetExperience(org.apache.xmlbeans.XmlDouble experience);
        
        /**
         * Nils the "experience" element
         */
        void setNilExperience();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience newInstance() {
              return (services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (services.all.GetEmployeesByExperienceDocument.GetEmployeesByExperience) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.all.GetEmployeesByExperienceDocument newInstance() {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.all.GetEmployeesByExperienceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.all.GetEmployeesByExperienceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.all.GetEmployeesByExperienceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.all.GetEmployeesByExperienceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.GetEmployeesByExperienceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.GetEmployeesByExperienceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.GetEmployeesByExperienceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
