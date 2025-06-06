/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ExcluirContaContabilRequest.java,v 1.2 2018/01/24 09:19:29 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.request;

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
 * Class ExcluirContaContabilRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/01/24 09:19:29 $
 */
public class ExcluirContaContabilRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoGrupo
     */
    private int _codigoGrupo = 0;

    /**
     * keeps track of state for field: _codigoGrupo
     */
    private boolean _has_codigoGrupo;

    /**
     * Field _codigoSubgrupo
     */
    private int _codigoSubgrupo = 0;

    /**
     * keeps track of state for field: _codigoSubgrupo
     */
    private boolean _has_codigoSubgrupo;

    /**
     * Field _codigoServico
     */
    private int _codigoServico = 0;

    /**
     * keeps track of state for field: _codigoServico
     */
    private boolean _has_codigoServico;

    /**
     * Field _codigoLeiComplementar
     */
    private int _codigoLeiComplementar = 0;

    /**
     * keeps track of state for field: _codigoLeiComplementar
     */
    private boolean _has_codigoLeiComplementar;

    /**
     * Field _codigoUsuario
     */
    private long _codigoUsuario = 0;

    /**
     * keeps track of state for field: _codigoUsuario
     */
    private boolean _has_codigoUsuario;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExcluirContaContabilRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.request.ExcluirContaContabilRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoGrupo
     * 
     */
    public void deleteCodigoGrupo()
    {
        this._has_codigoGrupo= false;
    } //-- void deleteCodigoGrupo() 

    /**
     * Method deleteCodigoLeiComplementar
     * 
     */
    public void deleteCodigoLeiComplementar()
    {
        this._has_codigoLeiComplementar= false;
    } //-- void deleteCodigoLeiComplementar() 

    /**
     * Method deleteCodigoServico
     * 
     */
    public void deleteCodigoServico()
    {
        this._has_codigoServico= false;
    } //-- void deleteCodigoServico() 

    /**
     * Method deleteCodigoSubgrupo
     * 
     */
    public void deleteCodigoSubgrupo()
    {
        this._has_codigoSubgrupo= false;
    } //-- void deleteCodigoSubgrupo() 

    /**
     * Method deleteCodigoUsuario
     * 
     */
    public void deleteCodigoUsuario()
    {
        this._has_codigoUsuario= false;
    } //-- void deleteCodigoUsuario() 

    /**
     * Returns the value of field 'codigoGrupo'.
     * 
     * @return int
     * @return the value of field 'codigoGrupo'.
     */
    public int getCodigoGrupo()
    {
        return this._codigoGrupo;
    } //-- int getCodigoGrupo() 

    /**
     * Returns the value of field 'codigoLeiComplementar'.
     * 
     * @return int
     * @return the value of field 'codigoLeiComplementar'.
     */
    public int getCodigoLeiComplementar()
    {
        return this._codigoLeiComplementar;
    } //-- int getCodigoLeiComplementar() 

    /**
     * Returns the value of field 'codigoServico'.
     * 
     * @return int
     * @return the value of field 'codigoServico'.
     */
    public int getCodigoServico()
    {
        return this._codigoServico;
    } //-- int getCodigoServico() 

    /**
     * Returns the value of field 'codigoSubgrupo'.
     * 
     * @return int
     * @return the value of field 'codigoSubgrupo'.
     */
    public int getCodigoSubgrupo()
    {
        return this._codigoSubgrupo;
    } //-- int getCodigoSubgrupo() 

    /**
     * Returns the value of field 'codigoUsuario'.
     * 
     * @return long
     * @return the value of field 'codigoUsuario'.
     */
    public long getCodigoUsuario()
    {
        return this._codigoUsuario;
    } //-- long getCodigoUsuario() 

    /**
     * Method hasCodigoGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoGrupo()
    {
        return this._has_codigoGrupo;
    } //-- boolean hasCodigoGrupo() 

    /**
     * Method hasCodigoLeiComplementar
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoLeiComplementar()
    {
        return this._has_codigoLeiComplementar;
    } //-- boolean hasCodigoLeiComplementar() 

    /**
     * Method hasCodigoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoServico()
    {
        return this._has_codigoServico;
    } //-- boolean hasCodigoServico() 

    /**
     * Method hasCodigoSubgrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSubgrupo()
    {
        return this._has_codigoSubgrupo;
    } //-- boolean hasCodigoSubgrupo() 

    /**
     * Method hasCodigoUsuario
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUsuario()
    {
        return this._has_codigoUsuario;
    } //-- boolean hasCodigoUsuario() 

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
     * Sets the value of field 'codigoGrupo'.
     * 
     * @param codigoGrupo the value of field 'codigoGrupo'.
     */
    public void setCodigoGrupo(int codigoGrupo)
    {
        this._codigoGrupo = codigoGrupo;
        this._has_codigoGrupo = true;
    } //-- void setCodigoGrupo(int) 

    /**
     * Sets the value of field 'codigoLeiComplementar'.
     * 
     * @param codigoLeiComplementar the value of field
     * 'codigoLeiComplementar'.
     */
    public void setCodigoLeiComplementar(int codigoLeiComplementar)
    {
        this._codigoLeiComplementar = codigoLeiComplementar;
        this._has_codigoLeiComplementar = true;
    } //-- void setCodigoLeiComplementar(int) 

    /**
     * Sets the value of field 'codigoServico'.
     * 
     * @param codigoServico the value of field 'codigoServico'.
     */
    public void setCodigoServico(int codigoServico)
    {
        this._codigoServico = codigoServico;
        this._has_codigoServico = true;
    } //-- void setCodigoServico(int) 

    /**
     * Sets the value of field 'codigoSubgrupo'.
     * 
     * @param codigoSubgrupo the value of field 'codigoSubgrupo'.
     */
    public void setCodigoSubgrupo(int codigoSubgrupo)
    {
        this._codigoSubgrupo = codigoSubgrupo;
        this._has_codigoSubgrupo = true;
    } //-- void setCodigoSubgrupo(int) 

    /**
     * Sets the value of field 'codigoUsuario'.
     * 
     * @param codigoUsuario the value of field 'codigoUsuario'.
     */
    public void setCodigoUsuario(long codigoUsuario)
    {
        this._codigoUsuario = codigoUsuario;
        this._has_codigoUsuario = true;
    } //-- void setCodigoUsuario(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExcluirContaContabilRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.request.ExcluirContaContabilRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.request.ExcluirContaContabilRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.request.ExcluirContaContabilRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.request.ExcluirContaContabilRequest unmarshal(java.io.Reader) 

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
