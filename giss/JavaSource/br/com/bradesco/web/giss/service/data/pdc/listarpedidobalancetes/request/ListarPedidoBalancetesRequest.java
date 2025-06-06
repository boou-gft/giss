/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarPedidoBalancetesRequest.java,v 1.1 2017/04/11 14:11:13 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.request;

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
 * Class ListarPedidoBalancetesRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:13 $
 */
public class ListarPedidoBalancetesRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeMaxOcorrencias
     */
    private int _qtdeMaxOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeMaxOcorrencias
     */
    private boolean _has_qtdeMaxOcorrencias;

    /**
     * Field _codTipoBalancete
     */
    private int _codTipoBalancete = 0;

    /**
     * keeps track of state for field: _codTipoBalancete
     */
    private boolean _has_codTipoBalancete;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarPedidoBalancetesRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.request.ListarPedidoBalancetesRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodTipoBalancete
     * 
     */
    public void deleteCodTipoBalancete()
    {
        this._has_codTipoBalancete= false;
    } //-- void deleteCodTipoBalancete() 

    /**
     * Method deleteQtdeMaxOcorrencias
     * 
     */
    public void deleteQtdeMaxOcorrencias()
    {
        this._has_qtdeMaxOcorrencias= false;
    } //-- void deleteQtdeMaxOcorrencias() 

    /**
     * Returns the value of field 'codTipoBalancete'.
     * 
     * @return int
     * @return the value of field 'codTipoBalancete'.
     */
    public int getCodTipoBalancete()
    {
        return this._codTipoBalancete;
    } //-- int getCodTipoBalancete() 

    /**
     * Returns the value of field 'qtdeMaxOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeMaxOcorrencias'.
     */
    public int getQtdeMaxOcorrencias()
    {
        return this._qtdeMaxOcorrencias;
    } //-- int getQtdeMaxOcorrencias() 

    /**
     * Method hasCodTipoBalancete
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodTipoBalancete()
    {
        return this._has_codTipoBalancete;
    } //-- boolean hasCodTipoBalancete() 

    /**
     * Method hasQtdeMaxOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeMaxOcorrencias()
    {
        return this._has_qtdeMaxOcorrencias;
    } //-- boolean hasQtdeMaxOcorrencias() 

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
     * Sets the value of field 'codTipoBalancete'.
     * 
     * @param codTipoBalancete the value of field 'codTipoBalancete'
     */
    public void setCodTipoBalancete(int codTipoBalancete)
    {
        this._codTipoBalancete = codTipoBalancete;
        this._has_codTipoBalancete = true;
    } //-- void setCodTipoBalancete(int) 

    /**
     * Sets the value of field 'qtdeMaxOcorrencias'.
     * 
     * @param qtdeMaxOcorrencias the value of field
     * 'qtdeMaxOcorrencias'.
     */
    public void setQtdeMaxOcorrencias(int qtdeMaxOcorrencias)
    {
        this._qtdeMaxOcorrencias = qtdeMaxOcorrencias;
        this._has_qtdeMaxOcorrencias = true;
    } //-- void setQtdeMaxOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarPedidoBalancetesRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.request.ListarPedidoBalancetesRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.request.ListarPedidoBalancetesRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.request.ListarPedidoBalancetesRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.request.ListarPedidoBalancetesRequest unmarshal(java.io.Reader) 

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
