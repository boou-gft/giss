/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.request;

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
 * Class ListarMunicipiosSemConvenioRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarMunicipiosSemConvenioRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeOcorr
     */
    private int _qtdeOcorr = 0;

    /**
     * keeps track of state for field: _qtdeOcorr
     */
    private boolean _has_qtdeOcorr;

    /**
     * Field _codUf
     */
    private long _codUf = 0;

    /**
     * keeps track of state for field: _codUf
     */
    private boolean _has_codUf;

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

    public ListarMunicipiosSemConvenioRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.request.ListarMunicipiosSemConvenioRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodUf
     * 
     */
    public void deleteCodUf()
    {
        this._has_codUf= false;
    } //-- void deleteCodUf() 

    /**
     * Method deleteQtdeOcorr
     * 
     */
    public void deleteQtdeOcorr()
    {
        this._has_qtdeOcorr= false;
    } //-- void deleteQtdeOcorr() 

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
     * Returns the value of field 'codUf'.
     * 
     * @return long
     * @return the value of field 'codUf'.
     */
    public long getCodUf()
    {
        return this._codUf;
    } //-- long getCodUf() 

    /**
     * Returns the value of field 'qtdeOcorr'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorr'.
     */
    public int getQtdeOcorr()
    {
        return this._qtdeOcorr;
    } //-- int getQtdeOcorr() 

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
     * Method hasCodUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUf()
    {
        return this._has_codUf;
    } //-- boolean hasCodUf() 

    /**
     * Method hasQtdeOcorr
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorr()
    {
        return this._has_qtdeOcorr;
    } //-- boolean hasQtdeOcorr() 

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
     * Sets the value of field 'codUf'.
     * 
     * @param codUf the value of field 'codUf'.
     */
    public void setCodUf(long codUf)
    {
        this._codUf = codUf;
        this._has_codUf = true;
    } //-- void setCodUf(long) 

    /**
     * Sets the value of field 'qtdeOcorr'.
     * 
     * @param qtdeOcorr the value of field 'qtdeOcorr'.
     */
    public void setQtdeOcorr(int qtdeOcorr)
    {
        this._qtdeOcorr = qtdeOcorr;
        this._has_qtdeOcorr = true;
    } //-- void setQtdeOcorr(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarMunicipiosSemConvenioRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.request.ListarMunicipiosSemConvenioRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.request.ListarMunicipiosSemConvenioRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.request.ListarMunicipiosSemConvenioRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.request.ListarMunicipiosSemConvenioRequest unmarshal(java.io.Reader) 

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
