/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarLcAliquotaRequest.java,v 1.3 2017/12/08 17:29:24 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.request;

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
 * Class ListarLcAliquotaRequest.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/12/08 17:29:24 $
 */
public class ListarLcAliquotaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codItemLei
     */
    private int _codItemLei = 0;

    /**
     * keeps track of state for field: _codItemLei
     */
    private boolean _has_codItemLei;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarLcAliquotaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.request.ListarLcAliquotaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLei
     * 
     */
    public void deleteCodItemLei()
    {
        this._has_codItemLei= false;
    } //-- void deleteCodItemLei() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Returns the value of field 'codItemLei'.
     * 
     * @return int
     * @return the value of field 'codItemLei'.
     */
    public int getCodItemLei()
    {
        return this._codItemLei;
    } //-- int getCodItemLei() 

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
     * Method hasCodItemLei
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLei()
    {
        return this._has_codItemLei;
    } //-- boolean hasCodItemLei() 

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
     * Sets the value of field 'codItemLei'.
     * 
     * @param codItemLei the value of field 'codItemLei'.
     */
    public void setCodItemLei(int codItemLei)
    {
        this._codItemLei = codItemLei;
        this._has_codItemLei = true;
    } //-- void setCodItemLei(int) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarLcAliquotaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.request.ListarLcAliquotaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.request.ListarLcAliquotaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.request.ListarLcAliquotaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.request.ListarLcAliquotaRequest unmarshal(java.io.Reader) 

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
