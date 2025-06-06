/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.2 2017/12/14 16:35:39 jaquelinebrito Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.response;

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
 * @version $Revision: 1.2 $ $Date: 2017/12/14 16:35:39 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoTipoIncidencia
     */
    private int _codigoTipoIncidencia = 0;

    /**
     * keeps track of state for field: _codigoTipoIncidencia
     */
    private boolean _has_codigoTipoIncidencia;

    /**
     * Field _descricaoTipoIncidencia
     */
    private java.lang.String _descricaoTipoIncidencia;

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
     * Field _hrManutencaoRegistro
     */
    private java.lang.String _hrManutencaoRegistro;

    /**
     * Field _codUsuario
     */
    private java.lang.String _codUsuario;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoTipoIncidencia
     * 
     */
    public void deleteCodigoTipoIncidencia()
    {
        this._has_codigoTipoIncidencia= false;
    } //-- void deleteCodigoTipoIncidencia() 

    /**
     * Returns the value of field 'codUsuario'.
     * 
     * @return String
     * @return the value of field 'codUsuario'.
     */
    public java.lang.String getCodUsuario()
    {
        return this._codUsuario;
    } //-- java.lang.String getCodUsuario() 

    /**
     * Returns the value of field 'codigoTipoIncidencia'.
     * 
     * @return int
     * @return the value of field 'codigoTipoIncidencia'.
     */
    public int getCodigoTipoIncidencia()
    {
        return this._codigoTipoIncidencia;
    } //-- int getCodigoTipoIncidencia() 

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
     * Returns the value of field 'descricaoTipoIncidencia'.
     * 
     * @return String
     * @return the value of field 'descricaoTipoIncidencia'.
     */
    public java.lang.String getDescricaoTipoIncidencia()
    {
        return this._descricaoTipoIncidencia;
    } //-- java.lang.String getDescricaoTipoIncidencia() 

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
     * Returns the value of field 'hrManutencaoRegistro'.
     * 
     * @return String
     * @return the value of field 'hrManutencaoRegistro'.
     */
    public java.lang.String getHrManutencaoRegistro()
    {
        return this._hrManutencaoRegistro;
    } //-- java.lang.String getHrManutencaoRegistro() 

    /**
     * Method hasCodigoTipoIncidencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoIncidencia()
    {
        return this._has_codigoTipoIncidencia;
    } //-- boolean hasCodigoTipoIncidencia() 

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
     * Sets the value of field 'codUsuario'.
     * 
     * @param codUsuario the value of field 'codUsuario'.
     */
    public void setCodUsuario(java.lang.String codUsuario)
    {
        this._codUsuario = codUsuario;
    } //-- void setCodUsuario(java.lang.String) 

    /**
     * Sets the value of field 'codigoTipoIncidencia'.
     * 
     * @param codigoTipoIncidencia the value of field
     * 'codigoTipoIncidencia'.
     */
    public void setCodigoTipoIncidencia(int codigoTipoIncidencia)
    {
        this._codigoTipoIncidencia = codigoTipoIncidencia;
        this._has_codigoTipoIncidencia = true;
    } //-- void setCodigoTipoIncidencia(int) 

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
     * Sets the value of field 'descricaoTipoIncidencia'.
     * 
     * @param descricaoTipoIncidencia the value of field
     * 'descricaoTipoIncidencia'.
     */
    public void setDescricaoTipoIncidencia(java.lang.String descricaoTipoIncidencia)
    {
        this._descricaoTipoIncidencia = descricaoTipoIncidencia;
    } //-- void setDescricaoTipoIncidencia(java.lang.String) 

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
     * Sets the value of field 'hrManutencaoRegistro'.
     * 
     * @param hrManutencaoRegistro the value of field
     * 'hrManutencaoRegistro'.
     */
    public void setHrManutencaoRegistro(java.lang.String hrManutencaoRegistro)
    {
        this._hrManutencaoRegistro = hrManutencaoRegistro;
    } //-- void setHrManutencaoRegistro(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.response.Ocorrencias unmarshal(java.io.Reader) 

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
