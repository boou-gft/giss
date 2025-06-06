/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciasHistMunicipio.java,v 1.2 2017/07/25 18:15:11 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response;

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
 * Class OcorrenciasHistMunicipio.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/07/25 18:15:11 $
 */
public class OcorrenciasHistMunicipio implements java.io.Serializable {


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
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;

    /**
     * Field _dataExclusao
     */
    private java.lang.String _dataExclusao;

    /**
     * Field _horainclusao
     */
    private java.lang.String _horainclusao;

    /**
     * Field _horaAtualizacao
     */
    private java.lang.String _horaAtualizacao;

    /**
     * Field _codigoFuncional
     */
    private java.lang.String _codigoFuncional;


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasHistMunicipio() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio()


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
     * Returns the value of field 'codigoFuncional'.
     * 
     * @return String
     * @return the value of field 'codigoFuncional'.
     */
    public java.lang.String getCodigoFuncional()
    {
        return this._codigoFuncional;
    } //-- java.lang.String getCodigoFuncional() 

    /**
     * Returns the value of field 'dataAtualizacao'.
     * 
     * @return String
     * @return the value of field 'dataAtualizacao'.
     */
    public java.lang.String getDataAtualizacao()
    {
        return this._dataAtualizacao;
    } //-- java.lang.String getDataAtualizacao() 

    /**
     * Returns the value of field 'dataExclusao'.
     * 
     * @return String
     * @return the value of field 'dataExclusao'.
     */
    public java.lang.String getDataExclusao()
    {
        return this._dataExclusao;
    } //-- java.lang.String getDataExclusao() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'horaAtualizacao'.
     * 
     * @return String
     * @return the value of field 'horaAtualizacao'.
     */
    public java.lang.String getHoraAtualizacao()
    {
        return this._horaAtualizacao;
    } //-- java.lang.String getHoraAtualizacao() 

    /**
     * Returns the value of field 'horainclusao'.
     * 
     * @return String
     * @return the value of field 'horainclusao'.
     */
    public java.lang.String getHorainclusao()
    {
        return this._horainclusao;
    } //-- java.lang.String getHorainclusao() 

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
     * Sets the value of field 'codigoFuncional'.
     * 
     * @param codigoFuncional the value of field 'codigoFuncional'.
     */
    public void setCodigoFuncional(java.lang.String codigoFuncional)
    {
        this._codigoFuncional = codigoFuncional;
    } //-- void setCodigoFuncional(java.lang.String) 

    /**
     * Sets the value of field 'dataAtualizacao'.
     * 
     * @param dataAtualizacao the value of field 'dataAtualizacao'.
     */
    public void setDataAtualizacao(java.lang.String dataAtualizacao)
    {
        this._dataAtualizacao = dataAtualizacao;
    } //-- void setDataAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'dataExclusao'.
     * 
     * @param dataExclusao the value of field 'dataExclusao'.
     */
    public void setDataExclusao(java.lang.String dataExclusao)
    {
        this._dataExclusao = dataExclusao;
    } //-- void setDataExclusao(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'horaAtualizacao'.
     * 
     * @param horaAtualizacao the value of field 'horaAtualizacao'.
     */
    public void setHoraAtualizacao(java.lang.String horaAtualizacao)
    {
        this._horaAtualizacao = horaAtualizacao;
    } //-- void setHoraAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'horainclusao'.
     * 
     * @param horainclusao the value of field 'horainclusao'.
     */
    public void setHorainclusao(java.lang.String horainclusao)
    {
        this._horainclusao = horainclusao;
    } //-- void setHorainclusao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasHistMunicipio
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio unmarshal(java.io.Reader) 

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
