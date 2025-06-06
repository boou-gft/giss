/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.request;

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
 * Class ManterAliquotaDetalheRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ManterAliquotaDetalheRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _tipoTela
     */
    private java.lang.String _tipoTela;

    /**
     * Field _indicadorPesquisa
     */
    private java.lang.String _indicadorPesquisa;


      //----------------/
     //- Constructors -/
    //----------------/

    public ManterAliquotaDetalheRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.request.ManterAliquotaDetalheRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'indicadorPesquisa'.
     * 
     * @return String
     * @return the value of field 'indicadorPesquisa'.
     */
    public java.lang.String getIndicadorPesquisa()
    {
        return this._indicadorPesquisa;
    } //-- java.lang.String getIndicadorPesquisa() 

    /**
     * Returns the value of field 'tipoTela'.
     * 
     * @return String
     * @return the value of field 'tipoTela'.
     */
    public java.lang.String getTipoTela()
    {
        return this._tipoTela;
    } //-- java.lang.String getTipoTela() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

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
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'indicadorPesquisa'.
     * 
     * @param indicadorPesquisa the value of field
     * 'indicadorPesquisa'.
     */
    public void setIndicadorPesquisa(java.lang.String indicadorPesquisa)
    {
        this._indicadorPesquisa = indicadorPesquisa;
    } //-- void setIndicadorPesquisa(java.lang.String) 

    /**
     * Sets the value of field 'tipoTela'.
     * 
     * @param tipoTela the value of field 'tipoTela'.
     */
    public void setTipoTela(java.lang.String tipoTela)
    {
        this._tipoTela = tipoTela;
    } //-- void setTipoTela(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ManterAliquotaDetalheRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.request.ManterAliquotaDetalheRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.request.ManterAliquotaDetalheRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.request.ManterAliquotaDetalheRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.request.ManterAliquotaDetalheRequest unmarshal(java.io.Reader) 

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
