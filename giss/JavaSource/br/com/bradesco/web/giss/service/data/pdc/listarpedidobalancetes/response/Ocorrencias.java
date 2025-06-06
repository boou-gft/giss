/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:09:57 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.response;

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
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:57 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codSolicitacaoBalancete
     */
    private long _codSolicitacaoBalancete = 0;

    /**
     * keeps track of state for field: _codSolicitacaoBalancete
     */
    private boolean _has_codSolicitacaoBalancete;

    /**
     * Field _codTipoBalancete
     */
    private java.lang.String _codTipoBalancete;

    /**
     * Field _dtInicioPesquisa
     */
    private int _dtInicioPesquisa = 0;

    /**
     * keeps track of state for field: _dtInicioPesquisa
     */
    private boolean _has_dtInicioPesquisa;

    /**
     * Field _dtFimPesquisa
     */
    private int _dtFimPesquisa = 0;

    /**
     * keeps track of state for field: _dtFimPesquisa
     */
    private boolean _has_dtFimPesquisa;

    /**
     * Field _descUf
     */
    private java.lang.String _descUf;

    /**
     * Field _descEmpresa
     */
    private java.lang.String _descEmpresa;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codSituacaoPedido
     */
    private java.lang.String _codSituacaoPedido;

    /**
     * Field _descSituacaoPedido
     */
    private java.lang.String _descSituacaoPedido;

    /**
     * Field _hrInclusaoPedido
     */
    private java.lang.String _hrInclusaoPedido;

    /**
     * Field _codDependencia
     */
    private int _codDependencia;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.response.Ocorrencias()


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
     * Method deleteCodSolicitacaoBalancete
     * 
     */
    public void deleteCodSolicitacaoBalancete()
    {
        this._has_codSolicitacaoBalancete= false;
    } //-- void deleteCodSolicitacaoBalancete() 

    /**
     * Method deleteDtFimPesquisa
     * 
     */
    public void deleteDtFimPesquisa()
    {
        this._has_dtFimPesquisa= false;
    } //-- void deleteDtFimPesquisa() 

    /**
     * Method deleteDtInicioPesquisa
     * 
     */
    public void deleteDtInicioPesquisa()
    {
        this._has_dtInicioPesquisa= false;
    } //-- void deleteDtInicioPesquisa() 

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
     * Returns the value of field 'codSituacaoPedido'.
     * 
     * @return String
     * @return the value of field 'codSituacaoPedido'.
     */
    public java.lang.String getCodSituacaoPedido()
    {
        return this._codSituacaoPedido;
    } //-- java.lang.String getCodSituacaoPedido() 

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
     * Returns the value of field 'codTipoBalancete'.
     * 
     * @return String
     * @return the value of field 'codTipoBalancete'.
     */
    public java.lang.String getCodTipoBalancete()
    {
        return this._codTipoBalancete;
    } //-- java.lang.String getCodTipoBalancete() 

    /**
     * Returns the value of field 'descEmpresa'.
     * 
     * @return String
     * @return the value of field 'descEmpresa'.
     */
    public java.lang.String getDescEmpresa()
    {
        return this._descEmpresa;
    } //-- java.lang.String getDescEmpresa() 

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
     * Returns the value of field 'descSituacaoPedido'.
     * 
     * @return String
     * @return the value of field 'descSituacaoPedido'.
     */
    public java.lang.String getDescSituacaoPedido()
    {
        return this._descSituacaoPedido;
    } //-- java.lang.String getDescSituacaoPedido() 

    /**
     * Returns the value of field 'descUf'.
     * 
     * @return String
     * @return the value of field 'descUf'.
     */
    public java.lang.String getDescUf()
    {
        return this._descUf;
    } //-- java.lang.String getDescUf() 

    /**
     * Returns the value of field 'dtFimPesquisa'.
     * 
     * @return int
     * @return the value of field 'dtFimPesquisa'.
     */
    public int getDtFimPesquisa()
    {
        return this._dtFimPesquisa;
    } //-- int getDtFimPesquisa() 

    /**
     * Returns the value of field 'dtInicioPesquisa'.
     * 
     * @return int
     * @return the value of field 'dtInicioPesquisa'.
     */
    public int getDtInicioPesquisa()
    {
        return this._dtInicioPesquisa;
    } //-- int getDtInicioPesquisa() 

    /**
     * Returns the value of field 'hrInclusaoPedido'.
     * 
     * @return String
     * @return the value of field 'hrInclusaoPedido'.
     */
    public java.lang.String getHrInclusaoPedido()
    {
        return this._hrInclusaoPedido;
    } //-- java.lang.String getHrInclusaoPedido() 

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
     * Method hasDtFimPesquisa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtFimPesquisa()
    {
        return this._has_dtFimPesquisa;
    } //-- boolean hasDtFimPesquisa() 

    /**
     * Method hasDtInicioPesquisa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtInicioPesquisa()
    {
        return this._has_dtInicioPesquisa;
    } //-- boolean hasDtInicioPesquisa() 

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
     * Sets the value of field 'codSituacaoPedido'.
     * 
     * @param codSituacaoPedido the value of field
     * 'codSituacaoPedido'.
     */
    public void setCodSituacaoPedido(java.lang.String codSituacaoPedido)
    {
        this._codSituacaoPedido = codSituacaoPedido;
    } //-- void setCodSituacaoPedido(java.lang.String) 

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
     * Sets the value of field 'codTipoBalancete'.
     * 
     * @param codTipoBalancete the value of field 'codTipoBalancete'
     */
    public void setCodTipoBalancete(java.lang.String codTipoBalancete)
    {
        this._codTipoBalancete = codTipoBalancete;
    } //-- void setCodTipoBalancete(java.lang.String) 

    /**
     * Sets the value of field 'descEmpresa'.
     * 
     * @param descEmpresa the value of field 'descEmpresa'.
     */
    public void setDescEmpresa(java.lang.String descEmpresa)
    {
        this._descEmpresa = descEmpresa;
    } //-- void setDescEmpresa(java.lang.String) 

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
     * Sets the value of field 'descSituacaoPedido'.
     * 
     * @param descSituacaoPedido the value of field
     * 'descSituacaoPedido'.
     */
    public void setDescSituacaoPedido(java.lang.String descSituacaoPedido)
    {
        this._descSituacaoPedido = descSituacaoPedido;
    } //-- void setDescSituacaoPedido(java.lang.String) 

    /**
     * Sets the value of field 'descUf'.
     * 
     * @param descUf the value of field 'descUf'.
     */
    public void setDescUf(java.lang.String descUf)
    {
        this._descUf = descUf;
    } //-- void setDescUf(java.lang.String) 

    /**
     * Sets the value of field 'dtFimPesquisa'.
     * 
     * @param dtFimPesquisa the value of field 'dtFimPesquisa'.
     */
    public void setDtFimPesquisa(int dtFimPesquisa)
    {
        this._dtFimPesquisa = dtFimPesquisa;
        this._has_dtFimPesquisa = true;
    } //-- void setDtFimPesquisa(int) 

    /**
     * Sets the value of field 'dtInicioPesquisa'.
     * 
     * @param dtInicioPesquisa the value of field 'dtInicioPesquisa'
     */
    public void setDtInicioPesquisa(int dtInicioPesquisa)
    {
        this._dtInicioPesquisa = dtInicioPesquisa;
        this._has_dtInicioPesquisa = true;
    } //-- void setDtInicioPesquisa(int) 

    /**
     * Sets the value of field 'hrInclusaoPedido'.
     * 
     * @param hrInclusaoPedido the value of field 'hrInclusaoPedido'
     */
    public void setHrInclusaoPedido(java.lang.String hrInclusaoPedido)
    {
        this._hrInclusaoPedido = hrInclusaoPedido;
    } //-- void setHrInclusaoPedido(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.response.Ocorrencias unmarshal(java.io.Reader) 

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
