/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ExcluirCtaContabilRequest.java,v 1.3 2018/01/24 09:19:29 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.request;

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
 * Class ExcluirCtaContabilRequest.
 * 
 * @version $Revision: 1.3 $ $Date: 2018/01/24 09:19:29 $
 */
public class ExcluirCtaContabilRequest implements java.io.Serializable {


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
     * Field _codigoSubGrupo
     */
    private int _codigoSubGrupo = 0;

    /**
     * keeps track of state for field: _codigoSubGrupo
     */
    private boolean _has_codigoSubGrupo;

    /**
     * Field _conta
     */
    private int _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _codLeiComplementar
     */
    private int _codLeiComplementar = 0;

    /**
     * keeps track of state for field: _codLeiComplementar
     */
    private boolean _has_codLeiComplementar;

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

    public ExcluirCtaContabilRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.request.ExcluirCtaContabilRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodLeiComplementar
     * 
     */
    public void deleteCodLeiComplementar()
    {
        this._has_codLeiComplementar= false;
    } //-- void deleteCodLeiComplementar() 

    /**
     * Method deleteCodigoGrupo
     * 
     */
    public void deleteCodigoGrupo()
    {
        this._has_codigoGrupo= false;
    } //-- void deleteCodigoGrupo() 

    /**
     * Method deleteCodigoSubGrupo
     * 
     */
    public void deleteCodigoSubGrupo()
    {
        this._has_codigoSubGrupo= false;
    } //-- void deleteCodigoSubGrupo() 

    /**
     * Method deleteCodigoUsuario
     * 
     */
    public void deleteCodigoUsuario()
    {
        this._has_codigoUsuario= false;
    } //-- void deleteCodigoUsuario() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Returns the value of field 'codLeiComplementar'.
     * 
     * @return int
     * @return the value of field 'codLeiComplementar'.
     */
    public int getCodLeiComplementar()
    {
        return this._codLeiComplementar;
    } //-- int getCodLeiComplementar() 

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
     * Returns the value of field 'codigoSubGrupo'.
     * 
     * @return int
     * @return the value of field 'codigoSubGrupo'.
     */
    public int getCodigoSubGrupo()
    {
        return this._codigoSubGrupo;
    } //-- int getCodigoSubGrupo() 

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
     * Returns the value of field 'conta'.
     * 
     * @return int
     * @return the value of field 'conta'.
     */
    public int getConta()
    {
        return this._conta;
    } //-- int getConta() 

    /**
     * Method hasCodLeiComplementar
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodLeiComplementar()
    {
        return this._has_codLeiComplementar;
    } //-- boolean hasCodLeiComplementar() 

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
     * Method hasCodigoSubGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSubGrupo()
    {
        return this._has_codigoSubGrupo;
    } //-- boolean hasCodigoSubGrupo() 

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
     * Method hasConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConta()
    {
        return this._has_conta;
    } //-- boolean hasConta() 

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
     * Sets the value of field 'codLeiComplementar'.
     * 
     * @param codLeiComplementar the value of field
     * 'codLeiComplementar'.
     */
    public void setCodLeiComplementar(int codLeiComplementar)
    {
        this._codLeiComplementar = codLeiComplementar;
        this._has_codLeiComplementar = true;
    } //-- void setCodLeiComplementar(int) 

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
     * Sets the value of field 'codigoSubGrupo'.
     * 
     * @param codigoSubGrupo the value of field 'codigoSubGrupo'.
     */
    public void setCodigoSubGrupo(int codigoSubGrupo)
    {
        this._codigoSubGrupo = codigoSubGrupo;
        this._has_codigoSubGrupo = true;
    } //-- void setCodigoSubGrupo(int) 

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
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(int conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExcluirCtaContabilRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.request.ExcluirCtaContabilRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.request.ExcluirCtaContabilRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.request.ExcluirCtaContabilRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.request.ExcluirCtaContabilRequest unmarshal(java.io.Reader) 

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
