/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarBalancetesRequest.java,v 1.1 2017/04/11 14:12:02 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.request;

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
 * Class ListarBalancetesRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:02 $
 */
public class ListarBalancetesRequest implements java.io.Serializable {


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
     * Field _codSolicitacaoBalancete
     */
    private long _codSolicitacaoBalancete = 0;

    /**
     * keeps track of state for field: _codSolicitacaoBalancete
     */
    private boolean _has_codSolicitacaoBalancete;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _dtMesAno
     */
    private int _dtMesAno = 0;

    /**
     * keeps track of state for field: _dtMesAno
     */
    private boolean _has_dtMesAno;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarBalancetesRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.request.ListarBalancetesRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodSolicitacaoBalancete
     * 
     */
    public void deleteCodSolicitacaoBalancete()
    {
        this._has_codSolicitacaoBalancete= false;
    } //-- void deleteCodSolicitacaoBalancete() 

    /**
     * Method deleteDtMesAno
     * 
     */
    public void deleteDtMesAno()
    {
        this._has_dtMesAno= false;
    } //-- void deleteDtMesAno() 

    /**
     * Method deleteQtdeMaxOcorrencias
     * 
     */
    public void deleteQtdeMaxOcorrencias()
    {
        this._has_qtdeMaxOcorrencias= false;
    } //-- void deleteQtdeMaxOcorrencias() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

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
     * Returns the value of field 'codSolicitacaoBalancete'.
     * 
     * @return long
     * @return the value of field 'codSolicitacaoBalancete'.
     */
    public long getCodSolicitacaoBalancete()
    {
        return this._codSolicitacaoBalancete;
    } //-- long getCodSolicitacaoBalancete() 

    /**
     * Returns the value of field 'dtMesAno'.
     * 
     * @return int
     * @return the value of field 'dtMesAno'.
     */
    public int getDtMesAno()
    {
        return this._dtMesAno;
    } //-- int getDtMesAno() 

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
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

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
     * Method hasCodSolicitacaoBalancete
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSolicitacaoBalancete()
    {
        return this._has_codSolicitacaoBalancete;
    } //-- boolean hasCodSolicitacaoBalancete() 

    /**
     * Method hasDtMesAno
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtMesAno()
    {
        return this._has_dtMesAno;
    } //-- boolean hasDtMesAno() 

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
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

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
     * Sets the value of field 'codSolicitacaoBalancete'.
     * 
     * @param codSolicitacaoBalancete the value of field
     * 'codSolicitacaoBalancete'.
     */
    public void setCodSolicitacaoBalancete(long codSolicitacaoBalancete)
    {
        this._codSolicitacaoBalancete = codSolicitacaoBalancete;
        this._has_codSolicitacaoBalancete = true;
    } //-- void setCodSolicitacaoBalancete(long) 

    /**
     * Sets the value of field 'dtMesAno'.
     * 
     * @param dtMesAno the value of field 'dtMesAno'.
     */
    public void setDtMesAno(int dtMesAno)
    {
        this._dtMesAno = dtMesAno;
        this._has_dtMesAno = true;
    } //-- void setDtMesAno(int) 

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
     * @return ListarBalancetesRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.request.ListarBalancetesRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.request.ListarBalancetesRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.request.ListarBalancetesRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.request.ListarBalancetesRequest unmarshal(java.io.Reader) 

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
