/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarReprocessamentoPorMunicipioRequest.java,v 1.1 2017/04/11 14:12:40 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarReprocessamentoPorMunicipioRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:40 $
 */
public class ListarReprocessamentoPorMunicipioRequest implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroMaximoOcorrencias
     */
    private int _numeroMaximoOcorrencias = 0;

    /**
     * keeps track of state for field: _numeroMaximoOcorrencias
     */
    private boolean _has_numeroMaximoOcorrencias;

    /**
     * Field _codigoEstado
     */
    private int _codigoEstado = 0;

    /**
     * keeps track of state for field: _codigoEstado
     */
    private boolean _has_codigoEstado;

    /**
     * Field _dataInicialReprocessamento
     */
    private java.lang.String _dataInicialReprocessamento;

    /**
     * Field _dataFinalReprocessamento
     */
    private java.lang.String _dataFinalReprocessamento;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarReprocessamentoPorMunicipioRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.request.ListarReprocessamentoPorMunicipioRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoEstado
     * 
     */
    public void deleteCodigoEstado()
    {
        this._has_codigoEstado= false;
    } //-- void deleteCodigoEstado() 

    /**
     * Method deleteNumeroMaximoOcorrencias
     * 
     */
    public void deleteNumeroMaximoOcorrencias()
    {
        this._has_numeroMaximoOcorrencias= false;
    } //-- void deleteNumeroMaximoOcorrencias() 

    /**
     * Returns the value of field 'codigoEstado'.
     * 
     * @return int
     * @return the value of field 'codigoEstado'.
     */
    public int getCodigoEstado()
    {
        return this._codigoEstado;
    } //-- int getCodigoEstado() 

    /**
     * Returns the value of field 'dataFinalReprocessamento'.
     * 
     * @return String
     * @return the value of field 'dataFinalReprocessamento'.
     */
    public java.lang.String getDataFinalReprocessamento()
    {
        return this._dataFinalReprocessamento;
    } //-- java.lang.String getDataFinalReprocessamento() 

    /**
     * Returns the value of field 'dataInicialReprocessamento'.
     * 
     * @return String
     * @return the value of field 'dataInicialReprocessamento'.
     */
    public java.lang.String getDataInicialReprocessamento()
    {
        return this._dataInicialReprocessamento;
    } //-- java.lang.String getDataInicialReprocessamento() 

    /**
     * Returns the value of field 'numeroMaximoOcorrencias'.
     * 
     * @return int
     * @return the value of field 'numeroMaximoOcorrencias'.
     */
    public int getNumeroMaximoOcorrencias()
    {
        return this._numeroMaximoOcorrencias;
    } //-- int getNumeroMaximoOcorrencias() 

    /**
     * Method hasCodigoEstado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoEstado()
    {
        return this._has_codigoEstado;
    } //-- boolean hasCodigoEstado() 

    /**
     * Method hasNumeroMaximoOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroMaximoOcorrencias()
    {
        return this._has_numeroMaximoOcorrencias;
    } //-- boolean hasNumeroMaximoOcorrencias() 

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
     * Sets the value of field 'codigoEstado'.
     * 
     * @param codigoEstado the value of field 'codigoEstado'.
     */
    public void setCodigoEstado(int codigoEstado)
    {
        this._codigoEstado = codigoEstado;
        this._has_codigoEstado = true;
    } //-- void setCodigoEstado(int) 

    /**
     * Sets the value of field 'dataFinalReprocessamento'.
     * 
     * @param dataFinalReprocessamento the value of field
     * 'dataFinalReprocessamento'.
     */
    public void setDataFinalReprocessamento(java.lang.String dataFinalReprocessamento)
    {
        this._dataFinalReprocessamento = dataFinalReprocessamento;
    } //-- void setDataFinalReprocessamento(java.lang.String) 

    /**
     * Sets the value of field 'dataInicialReprocessamento'.
     * 
     * @param dataInicialReprocessamento the value of field
     * 'dataInicialReprocessamento'.
     */
    public void setDataInicialReprocessamento(java.lang.String dataInicialReprocessamento)
    {
        this._dataInicialReprocessamento = dataInicialReprocessamento;
    } //-- void setDataInicialReprocessamento(java.lang.String) 

    /**
     * Sets the value of field 'numeroMaximoOcorrencias'.
     * 
     * @param numeroMaximoOcorrencias the value of field
     * 'numeroMaximoOcorrencias'.
     */
    public void setNumeroMaximoOcorrencias(int numeroMaximoOcorrencias)
    {
        this._numeroMaximoOcorrencias = numeroMaximoOcorrencias;
        this._has_numeroMaximoOcorrencias = true;
    } //-- void setNumeroMaximoOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarReprocessamentoPorMunicipioRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.request.ListarReprocessamentoPorMunicipioRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.request.ListarReprocessamentoPorMunicipioRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.request.ListarReprocessamentoPorMunicipioRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.request.ListarReprocessamentoPorMunicipioRequest unmarshal(java.io.Reader) 

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
