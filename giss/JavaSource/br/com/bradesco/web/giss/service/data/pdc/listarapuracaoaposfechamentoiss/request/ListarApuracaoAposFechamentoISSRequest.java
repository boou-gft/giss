/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApuracaoAposFechamentoISSRequest.java,v 1.1 2017/04/11 14:09:34 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.request;

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
 * Class ListarApuracaoAposFechamentoISSRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:34 $
 */
public class ListarApuracaoAposFechamentoISSRequest implements java.io.Serializable {


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
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoAposFechamentoISSRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.request.ListarApuracaoAposFechamentoISSRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteQuantidadeOcorrencias
     * 
     */
    public void deleteQuantidadeOcorrencias()
    {
        this._has_quantidadeOcorrencias= false;
    } //-- void deleteQuantidadeOcorrencias() 

    /**
     * Returns the value of field 'mesAnoApuracao'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracao'.
     */
    public int getMesAnoApuracao()
    {
        return this._mesAnoApuracao;
    } //-- int getMesAnoApuracao() 

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
     * Method hasMesAnoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracao()
    {
        return this._has_mesAnoApuracao;
    } //-- boolean hasMesAnoApuracao() 

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
     * Sets the value of field 'mesAnoApuracao'.
     * 
     * @param mesAnoApuracao the value of field 'mesAnoApuracao'.
     */
    public void setMesAnoApuracao(int mesAnoApuracao)
    {
        this._mesAnoApuracao = mesAnoApuracao;
        this._has_mesAnoApuracao = true;
    } //-- void setMesAnoApuracao(int) 

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
     * @return ListarApuracaoAposFechamentoISSRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.request.ListarApuracaoAposFechamentoISSRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.request.ListarApuracaoAposFechamentoISSRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.request.ListarApuracaoAposFechamentoISSRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.request.ListarApuracaoAposFechamentoISSRequest unmarshal(java.io.Reader) 

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
