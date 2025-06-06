/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: DetalharHistoricoTipoIncidenciaRequest.java,v 1.1 2017/04/11 14:13:03 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.request;

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
 * Class DetalharHistoricoTipoIncidenciaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:13:03 $
 */
public class DetalharHistoricoTipoIncidenciaRequest implements java.io.Serializable {


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
     * Field _dataInicio
     */
    private java.lang.String _dataInicio;

    /**
     * Field _dataFinal
     */
    private java.lang.String _dataFinal;

    /**
     * Field _hrManutencaoRegistro
     */
    private java.lang.String _hrManutencaoRegistro;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharHistoricoTipoIncidenciaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.request.DetalharHistoricoTipoIncidenciaRequest()


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
     * Returns the value of field 'dataFinal'.
     * 
     * @return String
     * @return the value of field 'dataFinal'.
     */
    public java.lang.String getDataFinal()
    {
        return this._dataFinal;
    } //-- java.lang.String getDataFinal() 

    /**
     * Returns the value of field 'dataInicio'.
     * 
     * @return String
     * @return the value of field 'dataInicio'.
     */
    public java.lang.String getDataInicio()
    {
        return this._dataInicio;
    } //-- java.lang.String getDataInicio() 

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
     * Sets the value of field 'dataFinal'.
     * 
     * @param dataFinal the value of field 'dataFinal'.
     */
    public void setDataFinal(java.lang.String dataFinal)
    {
        this._dataFinal = dataFinal;
    } //-- void setDataFinal(java.lang.String) 

    /**
     * Sets the value of field 'dataInicio'.
     * 
     * @param dataInicio the value of field 'dataInicio'.
     */
    public void setDataInicio(java.lang.String dataInicio)
    {
        this._dataInicio = dataInicio;
    } //-- void setDataInicio(java.lang.String) 

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
     * @return DetalharHistoricoTipoIncidenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.request.DetalharHistoricoTipoIncidenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.request.DetalharHistoricoTipoIncidenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.request.DetalharHistoricoTipoIncidenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.request.DetalharHistoricoTipoIncidenciaRequest unmarshal(java.io.Reader) 

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
