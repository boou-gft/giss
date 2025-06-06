/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: IncluirItemComplementarRequest.java,v 1.2 2017/12/22 16:34:51 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class IncluirItemComplementarRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/22 16:34:51 $
 */
public class IncluirItemComplementarRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codItemLC
     */
    private int _codItemLC = 0;

    /**
     * keeps track of state for field: _codItemLC
     */
    private boolean _has_codItemLC;

    /**
     * Field _decItemLC
     */
    private java.lang.String _decItemLC;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;


      //----------------/
     //- Constructors -/
    //----------------/

    public IncluirItemComplementarRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.request.IncluirItemComplementarRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLC
     * 
     */
    public void deleteCodItemLC()
    {
        this._has_codItemLC= false;
    } //-- void deleteCodItemLC() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Returns the value of field 'codItemLC'.
     * 
     * @return int
     * @return the value of field 'codItemLC'.
     */
    public int getCodItemLC()
    {
        return this._codItemLC;
    } //-- int getCodItemLC() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'decItemLC'.
     * 
     * @return String
     * @return the value of field 'decItemLC'.
     */
    public java.lang.String getDecItemLC()
    {
        return this._decItemLC;
    } //-- java.lang.String getDecItemLC() 

    /**
     * Method hasCodItemLC
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLC()
    {
        return this._has_codItemLC;
    } //-- boolean hasCodItemLC() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

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
     * Sets the value of field 'codItemLC'.
     * 
     * @param codItemLC the value of field 'codItemLC'.
     */
    public void setCodItemLC(int codItemLC)
    {
        this._codItemLC = codItemLC;
        this._has_codItemLC = true;
    } //-- void setCodItemLC(int) 

    /**
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'decItemLC'.
     * 
     * @param decItemLC the value of field 'decItemLC'.
     */
    public void setDecItemLC(java.lang.String decItemLC)
    {
        this._decItemLC = decItemLC;
    } //-- void setDecItemLC(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return IncluirItemComplementarRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.request.IncluirItemComplementarRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.request.IncluirItemComplementarRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.request.IncluirItemComplementarRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.request.IncluirItemComplementarRequest unmarshal(java.io.Reader) 

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
