/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarHistoricoTipoServicoRequest.java,v 1.2 2017/07/25 18:15:25 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.request;

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
 * Class ConsultarHistoricoTipoServicoRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/07/25 18:15:25 $
 */
public class ConsultarHistoricoTipoServicoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _quantidadeOcorrencias
     */
    private int _quantidadeOcorrencias = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencias
     */
    private boolean _has_quantidadeOcorrencias;

    /**
     * Field _dataInicial
     */
    private int _dataInicial = 0;

    /**
     * keeps track of state for field: _dataInicial
     */
    private boolean _has_dataInicial;

    /**
     * Field _dataFinal
     */
    private int _dataFinal = 0;

    /**
     * keeps track of state for field: _dataFinal
     */
    private boolean _has_dataFinal;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarHistoricoTipoServicoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.request.ConsultarHistoricoTipoServicoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteDataFinal
     * 
     */
    public void deleteDataFinal()
    {
        this._has_dataFinal= false;
    } //-- void deleteDataFinal() 

    /**
     * Method deleteDataInicial
     * 
     */
    public void deleteDataInicial()
    {
        this._has_dataInicial= false;
    } //-- void deleteDataInicial() 

    /**
     * Method deleteQuantidadeOcorrencias
     * 
     */
    public void deleteQuantidadeOcorrencias()
    {
        this._has_quantidadeOcorrencias= false;
    } //-- void deleteQuantidadeOcorrencias() 

    /**
     * Returns the value of field 'dataFinal'.
     * 
     * @return int
     * @return the value of field 'dataFinal'.
     */
    public int getDataFinal()
    {
        return this._dataFinal;
    } //-- int getDataFinal() 

    /**
     * Returns the value of field 'dataInicial'.
     * 
     * @return int
     * @return the value of field 'dataInicial'.
     */
    public int getDataInicial()
    {
        return this._dataInicial;
    } //-- int getDataInicial() 

    /**
     * Returns the value of field 'quantidadeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'quantidadeOcorrencias'.
     */
    public int getQuantidadeOcorrencias()
    {
        return this._quantidadeOcorrencias;
    } //-- int getQuantidadeOcorrencias() 

    /**
     * Method hasDataFinal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDataFinal()
    {
        return this._has_dataFinal;
    } //-- boolean hasDataFinal() 

    /**
     * Method hasDataInicial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDataInicial()
    {
        return this._has_dataInicial;
    } //-- boolean hasDataInicial() 

    /**
     * Method hasQuantidadeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidadeOcorrencias()
    {
        return this._has_quantidadeOcorrencias;
    } //-- boolean hasQuantidadeOcorrencias() 

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
     * Sets the value of field 'dataFinal'.
     * 
     * @param dataFinal the value of field 'dataFinal'.
     */
    public void setDataFinal(int dataFinal)
    {
        this._dataFinal = dataFinal;
        this._has_dataFinal = true;
    } //-- void setDataFinal(int) 

    /**
     * Sets the value of field 'dataInicial'.
     * 
     * @param dataInicial the value of field 'dataInicial'.
     */
    public void setDataInicial(int dataInicial)
    {
        this._dataInicial = dataInicial;
        this._has_dataInicial = true;
    } //-- void setDataInicial(int) 

    /**
     * Sets the value of field 'quantidadeOcorrencias'.
     * 
     * @param quantidadeOcorrencias the value of field
     * 'quantidadeOcorrencias'.
     */
    public void setQuantidadeOcorrencias(int quantidadeOcorrencias)
    {
        this._quantidadeOcorrencias = quantidadeOcorrencias;
        this._has_quantidadeOcorrencias = true;
    } //-- void setQuantidadeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarHistoricoTipoServicoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.request.ConsultarHistoricoTipoServicoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.request.ConsultarHistoricoTipoServicoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.request.ConsultarHistoricoTipoServicoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.request.ConsultarHistoricoTipoServicoRequest unmarshal(java.io.Reader) 

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
