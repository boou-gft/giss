/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarMunicipiosNovosRequest.java,v 1.1 2017/11/10 13:11:02 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.request;

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
 * Class ConsultarMunicipiosNovosRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/11/10 13:11:02 $
 */
public class ConsultarMunicipiosNovosRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _cdMunicipio
     */
    private long _cdMunicipio = 0;

    /**
     * keeps track of state for field: _cdMunicipio
     */
    private boolean _has_cdMunicipio;

    /**
     * Field _cdUf
     */
    private int _cdUf = 0;

    /**
     * keeps track of state for field: _cdUf
     */
    private boolean _has_cdUf;

    /**
     * Field _tipoPesquisa
     */
    private int _tipoPesquisa = 0;

    /**
     * keeps track of state for field: _tipoPesquisa
     */
    private boolean _has_tipoPesquisa;

    /**
     * Field _cdTela
     */
    private java.lang.String _cdTela;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarMunicipiosNovosRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.request.ConsultarMunicipiosNovosRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCdMunicipio
     * 
     */
    public void deleteCdMunicipio()
    {
        this._has_cdMunicipio= false;
    } //-- void deleteCdMunicipio() 

    /**
     * Method deleteCdUf
     * 
     */
    public void deleteCdUf()
    {
        this._has_cdUf= false;
    } //-- void deleteCdUf() 

    /**
     * Method deleteTipoPesquisa
     * 
     */
    public void deleteTipoPesquisa()
    {
        this._has_tipoPesquisa= false;
    } //-- void deleteTipoPesquisa() 

    /**
     * Returns the value of field 'cdMunicipio'.
     * 
     * @return long
     * @return the value of field 'cdMunicipio'.
     */
    public long getCdMunicipio()
    {
        return this._cdMunicipio;
    } //-- long getCdMunicipio() 

    /**
     * Returns the value of field 'cdTela'.
     * 
     * @return String
     * @return the value of field 'cdTela'.
     */
    public java.lang.String getCdTela()
    {
        return this._cdTela;
    } //-- java.lang.String getCdTela() 

    /**
     * Returns the value of field 'cdUf'.
     * 
     * @return int
     * @return the value of field 'cdUf'.
     */
    public int getCdUf()
    {
        return this._cdUf;
    } //-- int getCdUf() 

    /**
     * Returns the value of field 'tipoPesquisa'.
     * 
     * @return int
     * @return the value of field 'tipoPesquisa'.
     */
    public int getTipoPesquisa()
    {
        return this._tipoPesquisa;
    } //-- int getTipoPesquisa() 

    /**
     * Method hasCdMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdMunicipio()
    {
        return this._has_cdMunicipio;
    } //-- boolean hasCdMunicipio() 

    /**
     * Method hasCdUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdUf()
    {
        return this._has_cdUf;
    } //-- boolean hasCdUf() 

    /**
     * Method hasTipoPesquisa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTipoPesquisa()
    {
        return this._has_tipoPesquisa;
    } //-- boolean hasTipoPesquisa() 

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
     * Sets the value of field 'cdMunicipio'.
     * 
     * @param cdMunicipio the value of field 'cdMunicipio'.
     */
    public void setCdMunicipio(long cdMunicipio)
    {
        this._cdMunicipio = cdMunicipio;
        this._has_cdMunicipio = true;
    } //-- void setCdMunicipio(long) 

    /**
     * Sets the value of field 'cdTela'.
     * 
     * @param cdTela the value of field 'cdTela'.
     */
    public void setCdTela(java.lang.String cdTela)
    {
        this._cdTela = cdTela;
    } //-- void setCdTela(java.lang.String) 

    /**
     * Sets the value of field 'cdUf'.
     * 
     * @param cdUf the value of field 'cdUf'.
     */
    public void setCdUf(int cdUf)
    {
        this._cdUf = cdUf;
        this._has_cdUf = true;
    } //-- void setCdUf(int) 

    /**
     * Sets the value of field 'tipoPesquisa'.
     * 
     * @param tipoPesquisa the value of field 'tipoPesquisa'.
     */
    public void setTipoPesquisa(int tipoPesquisa)
    {
        this._tipoPesquisa = tipoPesquisa;
        this._has_tipoPesquisa = true;
    } //-- void setTipoPesquisa(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarMunicipiosNovosRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.request.ConsultarMunicipiosNovosRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.request.ConsultarMunicipiosNovosRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.request.ConsultarMunicipiosNovosRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.request.ConsultarMunicipiosNovosRequest unmarshal(java.io.Reader) 

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
