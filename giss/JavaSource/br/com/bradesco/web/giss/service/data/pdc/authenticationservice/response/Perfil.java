/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Perfil.java,v 1.1 2017/04/11 14:10:03 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Perfil.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:03 $
 */
public class Perfil implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPerfilAdicionalList
     */
    private java.util.Vector _codPerfilAdicionalList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Perfil() 
     {
        super();
        _codPerfilAdicionalList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addCodPerfilAdicional
     * 
     * 
     * 
     * @param vCodPerfilAdicional
     */
    public void addCodPerfilAdicional(java.lang.String vCodPerfilAdicional)
        throws java.lang.IndexOutOfBoundsException
    {
        _codPerfilAdicionalList.addElement(vCodPerfilAdicional);
    } //-- void addCodPerfilAdicional(java.lang.String) 

    /**
     * Method addCodPerfilAdicional
     * 
     * 
     * 
     * @param index
     * @param vCodPerfilAdicional
     */
    public void addCodPerfilAdicional(int index, java.lang.String vCodPerfilAdicional)
        throws java.lang.IndexOutOfBoundsException
    {
        _codPerfilAdicionalList.insertElementAt(vCodPerfilAdicional, index);
    } //-- void addCodPerfilAdicional(int, java.lang.String) 

    /**
     * Method enumerateCodPerfilAdicional
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateCodPerfilAdicional()
    {
        return _codPerfilAdicionalList.elements();
    } //-- java.util.Enumeration enumerateCodPerfilAdicional() 

    /**
     * Method getCodPerfilAdicional
     * 
     * 
     * 
     * @param index
     * @return String
     */
    public java.lang.String getCodPerfilAdicional(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _codPerfilAdicionalList.size())) {
            throw new IndexOutOfBoundsException("getCodPerfilAdicional: Index value '"+index+"' not in range [0.."+(_codPerfilAdicionalList.size() - 1) + "]");
        }
        
        return (String)_codPerfilAdicionalList.elementAt(index);
    } //-- java.lang.String getCodPerfilAdicional(int) 

    /**
     * Method getCodPerfilAdicional
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String[] getCodPerfilAdicional()
    {
        int size = _codPerfilAdicionalList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_codPerfilAdicionalList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getCodPerfilAdicional() 

    /**
     * Method getCodPerfilAdicionalCount
     * 
     * 
     * 
     * @return int
     */
    public int getCodPerfilAdicionalCount()
    {
        return _codPerfilAdicionalList.size();
    } //-- int getCodPerfilAdicionalCount() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllCodPerfilAdicional
     * 
     */
    public void removeAllCodPerfilAdicional()
    {
        _codPerfilAdicionalList.removeAllElements();
    } //-- void removeAllCodPerfilAdicional() 

    /**
     * Method removeCodPerfilAdicional
     * 
     * 
     * 
     * @param index
     * @return String
     */
    public java.lang.String removeCodPerfilAdicional(int index)
    {
        java.lang.Object obj = _codPerfilAdicionalList.elementAt(index);
        _codPerfilAdicionalList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeCodPerfilAdicional(int) 

    /**
     * Method setCodPerfilAdicional
     * 
     * 
     * 
     * @param index
     * @param vCodPerfilAdicional
     */
    public void setCodPerfilAdicional(int index, java.lang.String vCodPerfilAdicional)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _codPerfilAdicionalList.size())) {
            throw new IndexOutOfBoundsException("setCodPerfilAdicional: Index value '"+index+"' not in range [0.." + (_codPerfilAdicionalList.size() - 1) + "]");
        }
        _codPerfilAdicionalList.setElementAt(vCodPerfilAdicional, index);
    } //-- void setCodPerfilAdicional(int, java.lang.String) 

    /**
     * Method setCodPerfilAdicional
     * 
     * 
     * 
     * @param codPerfilAdicionalArray
     */
    public void setCodPerfilAdicional(java.lang.String[] codPerfilAdicionalArray)
    {
        //-- copy array
        _codPerfilAdicionalList.removeAllElements();
        for (int i = 0; i < codPerfilAdicionalArray.length; i++) {
            _codPerfilAdicionalList.addElement(codPerfilAdicionalArray[i]);
        }
    } //-- void setCodPerfilAdicional(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Perfil
     */
    public static br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
