/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: AlterarContaContabilRequest.java,v 1.2 2017/08/14 20:08:21 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.request;

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
 * Class AlterarContaContabilRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/08/14 20:08:21 $
 */
public class AlterarContaContabilRequest implements java.io.Serializable {


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
     * Field _conta
     */
    private int _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _codigoTipoServico
     */
    private int _codigoTipoServico = 0;

    /**
     * keeps track of state for field: _codigoTipoServico
     */
    private boolean _has_codigoTipoServico;

    /**
     * Field _codigoItemLeiCompl
     */
    private int _codigoItemLeiCompl = 0;

    /**
     * keeps track of state for field: _codigoItemLeiCompl
     */
    private boolean _has_codigoItemLeiCompl;

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

    public AlterarContaContabilRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.request.AlterarContaContabilRequest()


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
     * Method deleteCodigoItemLeiCompl
     * 
     */
    public void deleteCodigoItemLeiCompl()
    {
        this._has_codigoItemLeiCompl= false;
    } //-- void deleteCodigoItemLeiCompl() 

    /**
     * Method deleteCodigoSubgrupo
     * 
     */
    public void deleteCodigoSubgrupo()
    {
        this._has_codigoSubgrupo= false;
    } //-- void deleteCodigoSubgrupo() 

    /**
     * Method deleteCodigoTipoServico
     * 
     */
    public void deleteCodigoTipoServico()
    {
        this._has_codigoTipoServico= false;
    } //-- void deleteCodigoTipoServico() 

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
     * Returns the value of field 'codigoItemLeiCompl'.
     * 
     * @return int
     * @return the value of field 'codigoItemLeiCompl'.
     */
    public int getCodigoItemLeiCompl()
    {
        return this._codigoItemLeiCompl;
    } //-- int getCodigoItemLeiCompl() 

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
     * Returns the value of field 'codigoTipoServico'.
     * 
     * @return int
     * @return the value of field 'codigoTipoServico'.
     */
    public int getCodigoTipoServico()
    {
        return this._codigoTipoServico;
    } //-- int getCodigoTipoServico() 

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
     * Method hasCodigoItemLeiCompl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoItemLeiCompl()
    {
        return this._has_codigoItemLeiCompl;
    } //-- boolean hasCodigoItemLeiCompl() 

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
     * Method hasCodigoTipoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoServico()
    {
        return this._has_codigoTipoServico;
    } //-- boolean hasCodigoTipoServico() 

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
     * Sets the value of field 'codigoItemLeiCompl'.
     * 
     * @param codigoItemLeiCompl the value of field
     * 'codigoItemLeiCompl'.
     */
    public void setCodigoItemLeiCompl(int codigoItemLeiCompl)
    {
        this._codigoItemLeiCompl = codigoItemLeiCompl;
        this._has_codigoItemLeiCompl = true;
    } //-- void setCodigoItemLeiCompl(int) 

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
     * Sets the value of field 'codigoTipoServico'.
     * 
     * @param codigoTipoServico the value of field
     * 'codigoTipoServico'.
     */
    public void setCodigoTipoServico(int codigoTipoServico)
    {
        this._codigoTipoServico = codigoTipoServico;
        this._has_codigoTipoServico = true;
    } //-- void setCodigoTipoServico(int) 

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
     * @return AlterarContaContabilRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.request.AlterarContaContabilRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.request.AlterarContaContabilRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.request.AlterarContaContabilRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.request.AlterarContaContabilRequest unmarshal(java.io.Reader) 

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
