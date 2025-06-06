/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.2 2017/07/25 18:15:23 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.response;

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
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/07/25 18:15:23 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoTipoServico
     */
    private int _codigoTipoServico = 0;

    /**
     * keeps track of state for field: _codigoTipoServico
     */
    private boolean _has_codigoTipoServico;

    /**
     * Field _descricaoTipoServico
     */
    private java.lang.String _descricaoTipoServico;

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;

    /**
     * Field _horaAtualizacao
     */
    private java.lang.String _horaAtualizacao;

    /**
     * Field _dataExclusao
     */
    private java.lang.String _dataExclusao;

    /**
     * Field _codigoFuncional
     */
    private java.lang.String _codigoFuncional;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoTipoServico
     * 
     */
    public void deleteCodigoTipoServico()
    {
        this._has_codigoTipoServico= false;
    } //-- void deleteCodigoTipoServico() 

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
     * Returns the value of field 'codigoTipoServico'.
     * 
     * @return int
     * @return the value of field 'codigoTipoServico'.
     */
    public int getCodigoTipoServico()
    {
        return this._codigoTipoServico;
    } //-- int getCodigoTipoServico() 

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
     * Returns the value of field 'descricaoTipoServico'.
     * 
     * @return String
     * @return the value of field 'descricaoTipoServico'.
     */
    public java.lang.String getDescricaoTipoServico()
    {
        return this._descricaoTipoServico;
    } //-- java.lang.String getDescricaoTipoServico() 

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
     * Method hasCodigoTipoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoServico()
    {
        return this._has_codigoTipoServico;
    } //-- boolean hasCodigoTipoServico() 

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
     * Sets the value of field 'codigoFuncional'.
     * 
     * @param codigoFuncional the value of field 'codigoFuncional'.
     */
    public void setCodigoFuncional(java.lang.String codigoFuncional)
    {
        this._codigoFuncional = codigoFuncional;
    } //-- void setCodigoFuncional(java.lang.String) 

    /**
     * Sets the value of field 'codigoTipoServico'.
     * 
     * @param codigoTipoServico the value of field
     * 'codigoTipoServico'.
     */
    public void setCodigoTipoServico(int codigoTipoServico)
    {
        this._codigoTipoServico = codigoTipoServico;
        this._has_codigoTipoServico = true;
    } //-- void setCodigoTipoServico(int) 

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
     * Sets the value of field 'descricaoTipoServico'.
     * 
     * @param descricaoTipoServico the value of field
     * 'descricaoTipoServico'.
     */
    public void setDescricaoTipoServico(java.lang.String descricaoTipoServico)
    {
        this._descricaoTipoServico = descricaoTipoServico;
    } //-- void setDescricaoTipoServico(java.lang.String) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.response.Ocorrencias unmarshal(java.io.Reader) 

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
